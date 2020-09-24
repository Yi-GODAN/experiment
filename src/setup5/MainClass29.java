package setup5;

public class MainClass29 {

    public static void main(String[] args) {
        String strSearch = "This is the string in which you have to search for a subString.";
        String subString = "subString";
        boolean found = false;
        int max = strSearch.length() - subString.length();

        testLabel:
        for (int i = 0; i <= max; i++) {
            int length = subString.length();
            int j = i;
            int k = 0;
            while (length-- != 0) {
                if (strSearch.charAt(j++) != subString.charAt(k++))
                    continue testLabel;
            }
            found = true;
            break testLabel;
        }
        if (found) {
            System.out.println("发现子字符串");
        } else {
            System.out.println("字符串中没有发现子字符串");
        }

    }
}

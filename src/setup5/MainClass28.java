package setup5;

public class MainClass28 {

    public static void main(String[] args) {
        StringBuffer searchStr = new StringBuffer("Hello! how are you?");
        int length = searchStr.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchStr.charAt(i) != 'h')
                continue;
            count++;
            searchStr.setCharAt(i, 'h');
        }
        System.out.println("发现 " + count + " 个h字符");
        System.out.println(searchStr);
    }
}

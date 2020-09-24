package setup3;

public class String1 {
    public static void main(String[] args) {
        String string[] = {"this", "is", "a", "setup6", "of", "java"};
        {
            int count = 0;
            String s = "this is a PerpetualCalendar of java";
            for (int i = 0; i <= s.length() - 1; i++) {
                String getstr = s.substring(i, i + 1);
                if (getstr.equals("s"))
                    count++;
            }
            System.out.println("该字符串中字母s出现的次数为：" + count);
        }
        {
            int count = 0;
            for (int i = 0; i < string.length; i++) {
                if (string[i].endsWith("is"))
                    count++;
            }
            System.out.println("该字符串中子串is出现的次数为：" + count);
        }
        {
            int count = 0;
            for (int i = 0; i < string.length; i++) {
                if (string[i].equals("is"))
                    count++;
            }
            System.out.println("该字符串中单词is出现的次数为：" + count);
        }
        {
            String original = "this is a PerpetualCalendar of java";
            String result = "";
            char[] ch = original.toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {
                result += ch[i];
            }
            System.out.println("倒序输出：" + result);
        }

    }

}

package setup3;

public class String3 {
    public static void main(String[] args) {
        String string = "ddejidsEFALDFfnef2357 3ed";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isUpperCase(ch)) {
                count1++;
            } else if (Character.isLowerCase(ch)) {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println("大写字母个数为：" + count1 + "，小写字母个数为：" + count2 + "，非英文字母个数为：" + count3);

    }
}

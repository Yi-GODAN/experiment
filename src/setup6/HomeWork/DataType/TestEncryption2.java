package setup6.HomeWork.DataType;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/26 11:27
 */
public class TestEncryption2 {

    private static String plaintext = "今晚打老虎";

    public static void main(String[] args) {
        System.out.println("加密前原文：" + plaintext);
        System.out.println("密文：" + Encryption2(plaintext));
        System.out.println("密文：" + Encryption2(Encryption2(plaintext)));
    }

    public static String Encryption2(String str) {
        String en = "";
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                c = (char) (c ^ '8');
                en +=  c;
            }
        }
        return en;
    }

}

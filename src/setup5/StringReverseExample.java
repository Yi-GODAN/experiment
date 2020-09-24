package setup5;

public class StringReverseExample {

    public static void main(String[] args) {
        String str = "Hello World";
        String reverse = new StringBuffer(str).reverse().toString();

        System.out.println("字符串反转前: " + str);
        System.out.println("字符串反转后: " + reverse);
    }
}

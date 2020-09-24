package setup5;

public class Main {

    public static void main(String[] args) {
        String str = "This is a java";
        System.out.println(removeCharAt(str, 3));
    }

    //将substring() 封装在 removeCharAt 函数中
    public static String removeCharAt(String str, int pos) {
        return str.substring(0, pos) + str.substring(pos + 1);
    }
}

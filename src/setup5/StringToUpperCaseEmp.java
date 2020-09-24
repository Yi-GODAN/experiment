package setup5;

public class StringToUpperCaseEmp {

    public static void main(String[] args) {
        String str = "hello world";
        String strUpper = str.toUpperCase();
        String strLower = strUpper.toLowerCase();

        System.out.println("原字符串: " + str);
        System.out.println("转换为大写: " + strUpper);
        System.out.println("由大写转为小写: " + strLower);
    }
}

package setup5;

public class SearchStringEmp {

    public static void main(String[] args) {
        String str = "Hello World";
        int intIndex = str.indexOf("World");

        if (intIndex == -1) {
            System.out.println("没有找到字符串'World'");
        } else {
            System.out.println("'World'字符串的位置: " + intIndex);
        }
    }
}

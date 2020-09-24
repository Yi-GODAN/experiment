package setup5;

public class StringCompareEmp {

    public static void main(String[] args) {
        String str = "hello world";
        String str2 = "Hello World";
        Object obj = str;

        //字符串比较
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareToIgnoreCase(str2));  //忽略大小写
        System.out.println(str.compareTo(obj.toString()));
    }
}

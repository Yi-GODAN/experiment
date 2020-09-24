package setup5;

public class StringSplitEmp {

    public static void main(String[] args) {
        String str = "www-Google-com";
        String delimiter = "-"; //指定分割字符
        String[] temp = str.split(delimiter);          //分割字符

        //----------for------------
        System.out.println("------------ for ------------");
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }


        String str1 = "www.Google.com";
        String delimiter1 = "\\.";     // '.'需要转义
        String[] temp1 = str1.split(delimiter1);

        //---------for each--------
        System.out.println("------------ for each ------------");
        for (String i : temp1) {
            System.out.println(i);
        }
    }
}

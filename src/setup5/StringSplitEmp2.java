package setup5;

import java.util.StringTokenizer;

public class StringSplitEmp2 {

    public static void main(String[] args) {
        String str = "This is string , split by stringTokenizer , create by Google";
        StringTokenizer st = new StringTokenizer(str);
        StringTokenizer st2 = new StringTokenizer(str, ",");

        System.out.println("--------通过空格分割--------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("--------通过逗号分割--------");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }

    }
}

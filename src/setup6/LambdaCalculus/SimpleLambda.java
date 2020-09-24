package setup6.LambdaCalculus;

import java.util.Arrays;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 20:26
 */
public class SimpleLambda {

    public static void main(String[] args) {
        String[] arrays = new String[]{"Apple", "Orange", "Banana", "Lemon"};
        Arrays.sort(arrays, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        System.out.println(String.join(", ", arrays));

        Arrays.sort(arrays, SimpleLambda::cmp);
        System.out.println(String.join(", ", arrays));

        Arrays.sort(arrays, String::compareTo);
        System.out.println(String.join(", ", arrays));
    }

    public static int cmp(String s1, String s2) {
        return s1.compareTo(s2);
    }
}

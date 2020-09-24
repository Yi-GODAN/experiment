package setup6.HomeWork.Array;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 17:54
 */
public class ArrayRead {

    public static void main(String[] args) {
        String[] strArrays = {"apple", "banana", "c", "d", "e", "f", "g", "h", "i", "j"};

        Scanner s = new Scanner(System.in);
        if (s.hasNext()) {
            String str = s.next();
            System.out.println(isExist(strArrays, str));
        }
    }

    public static String isExist(String[] array, String string) {
        for (int i = 0; i < array.length; i++) {
            if (string.equals(array[i])) {
                return "Yes";
            }
        }
        return "No";
    }
}

package setup6.DataStructures;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/01 14:53
 */

public class FindTheSmallestAndSecondSmallest {

    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            if (i == 51) {
                continue;
            } else {
                array[i] = i + 1;
            }
        }

        for (int i = 0; i < 100; i++) {
            if (array[i] != i + 1) {
                System.out.println(i+1);
                break;
            }
        }
    }
}

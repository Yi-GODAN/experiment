package setup6.HomeWork.Array;

import java.util.Arrays;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 22:21
 */
public class mergeArray {

    public static void main(String[] args) {
        int[] array1 = new int[] {1, 7, 9, 11, 13, 15, 17, 19};
        int[] array2 = new int[] {2, 4, 6, 8, 10};


        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0, j = 0, k = 0; i < array3.length; i++) {
            if (j < array1.length) {
                array3[i] = array1[j];
                j ++;
            } else if (j >= array1.length & k < array2.length) {
                array3[i] = array2[k];
                k ++;
            }
        }

        Arrays.sort(array3);

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}

package setup6.HomeWork.Array;

import java.util.Arrays;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/09 14:02
 */
public class MergeSortArray {

    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 38, 34, 47, 44, 4, 19, 27, 50, 48, 15, 26, 2, 50, 39, 1};
        int[] mergeSortArray = mergeSort(array);

        for (int i = 0; i < mergeSortArray.length; i++) {
            System.out.print(mergeSortArray[i] + "\t");
        }
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0 , mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < array.length; index ++) {
            if (i >= left.length)
                array[index] = right[j++];
            else if (j >= right.length)
                array[index] = left[i++];
            else if (left[i] > right[j])
                array[index] = right[j++];
            else
                array[index] = left[i++];
        }
        return array;
    }
}

package setup6.HomeWork.Array;

import java.util.Arrays;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/29 22:37
 */
public class ArraySort {

    public static void main(String[] args) {
        // 定义数组
        int[] array = new int[]{3, 4, 5, 7, 9, 1, 6, 8, 2};
        // 将数组进行排序操作，从小到大


//        bubbleSort(array);
//        selectionSort(array);
//        insertionSort(array);
        int[] array2 = MergeSort(array);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }


//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "\t");
//        }
    }

    // 冒泡排序
    public static void bubbleSort(int array[]) {
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    // 选择排序
    public static void selectionSort(int[] array) {
        int index = 0;
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            index = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            tmp = array[index];
            array[index] = array[i];
            array[i] = tmp;
        }
    }

    // 插入排序
    public static void insertionSort(int[] array) {
        int current = 0;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
    }

    // 并归排序
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }

}

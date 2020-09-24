package setup6;

import java.util.Arrays;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/11 20:58
 */
public class test {

    public static void main(String[] args) {
        int[] a = {3, 5, 7, 2, 0};
//        System.out.println(Arrays.toString(bubbleSort(a, a.length)));
//        System.out.println(Arrays.toString(selectSort(a, a.length)));
//        System.out.println(Arrays.toString(QuickSort(a, 0, a.length - 1)));
        System.out.println(Arrays.toString(ShellSort(a)));

    }

    public static int[] bubbleSort(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectSort(int[] arr, int n) {
        int temp, minIndex = 0;
        for (int i = 0; i < n - 1; ++i) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            QuickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            QuickSort(array, smallIndex + 1, end);
        return array;
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex) {
                    swap(array, i, smallIndex);
                }
            }
        }
        return smallIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int perIndex = i - gap;
                while (perIndex >= 0 && array[perIndex] > temp) {
                    array[perIndex + gap] = array[perIndex];
                    perIndex -= gap;
                }
                array[perIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }

}

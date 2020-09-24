package setup6.HomeWork.Array;

/**
 * @Program: ThinkingInJava
 * @Description: 快排
 * @Author: YiMing
 * @Created: 2020/08/09 15:15
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 3, 7, 4, 8, 1, 9, 2, 5};
        int[] array2 = quickSort(array, 0, array.length - 1);


        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }

    }

    public static int[] quickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            quickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            quickSort(array, smallIndex + 1, end);
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
}

package setup6;

public class TestIntSort {
    public static void main(String[] args) {
        int[] array1 = {7, 5, 8, 6, 4, 2, 1, 3, 0, 9};

        int[] array2 = bubbleSort(array1);

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] a) {
        int temp;
        int len = a.length;
        for (int i = len - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

}

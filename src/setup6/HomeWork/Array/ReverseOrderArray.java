package setup6.HomeWork.Array;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 18:48
 */
public class ReverseOrderArray {

    public static void main(String[] args) {
        int[] arrays = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverse(arrays);

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "\t");
        }
    }

    public static int[] reverse(int[] array) {
        int temp = 0;
        int n = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[n];
            array[n] = temp;
            n --;
        }
        return array;
    }
}

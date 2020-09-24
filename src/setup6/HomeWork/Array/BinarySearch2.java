package setup6.HomeWork.Array;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 22:04
 */
public class BinarySearch2 {

    public static void main(String[] args) {
        int[] array = new int[]{3, 12, 24, 55, 68, 75, 88};
        System.out.println(binarySearch(array, 0, array.length - 1, 88));
    }

    public static int binarySearch(int[] array, int front, int end, int x) {
        int mid = (front + end) / 2;
        if (array[mid] == x) {
            return mid;
        } else if (array[mid] > x) {
            return binarySearch(array, front, mid - 1, x);
        } else {
            return binarySearch(array, mid + 1, end, x);
        }
    }
}

package setup6.HomeWork.Array;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 19:39
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[] {3, 12, 24, 55, 68, 75, 88};
        System.out.println(binarySearch(array, 24));
    }

    public static int binarySearch(int[] array, int x) {
        // 如果数组为空，直接返回-1，即查找失败
        if (array == null) {
            return -1;
        }
        // 起始位置
        int front = 0;
        // 结束位置
        int end = array.length - 1;

        while (front <= end) {
            // 中间位置
            int mid = (front + end) / 2;
            // 中值
            int midValue = array[mid];

            if (x == midValue) {
                // 等于中值直接返回
                return mid;
            } else if (x < midValue) {
                // 小于中值时在中值前面找
                end = mid - 1;
            } else {
                // 大于中值在中值后面找
                front = mid + 1;
            }
        }
        // 返回-1，即查找失败
        return -1;
    }
}

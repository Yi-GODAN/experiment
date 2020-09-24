package setup6.HomeWork.Array;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 19:18
 */
public class merge {

    public static void main(String[] args) {
        int[] oldArray = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        // 计数
        int sumZero = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] == 0) {
                sumZero ++;
            }
        }

        int[] newArray = new int[oldArray.length - sumZero];

        for (int i = 0 , j = 0; i < oldArray.length; i++) {
            if (oldArray[i] != 0) {
                newArray[j] = oldArray[i];
                j ++;
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }

    }
}

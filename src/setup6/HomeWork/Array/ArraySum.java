package setup6.HomeWork.Array;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 20:05
 */
public class ArraySum {

    public static void main(String[] args) {
        int[][] b = {{11}, {21, 22}, {31, 32, 33}};
        int sum = 0;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                sum += b[i][j];
            }
        }

        System.out.println(sum);
    }
}

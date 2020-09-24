package setup6.HomeWork.cycle;

/**
 * @Program: ThinkingInJava
 * @Description: 矩形
 * @Author: YiMing
 * @Created: 2020/07/28 17:09
 */
public class rectangle {

    public static void main(String[] args) {
        printRec(10);
    }

    public static void printRec(int n) {
        int length = n + n / 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

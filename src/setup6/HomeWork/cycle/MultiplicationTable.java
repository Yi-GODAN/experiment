package setup6.HomeWork.cycle;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 18:21
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 9; i >= 1; i--) {
            for (int k = 9; k >= i + 1; k--) {
                System.out.print("    \t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 9; i++) {
            for (int k = 9; k >= i + 1; k--) {
                System.out.print("\t\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}

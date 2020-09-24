package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/29 17:35
 */
public class Squareness {

    public static void main(String[] args) {
        System.out.println("请输入矩形长和宽：");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            printSqu(s.nextInt(), s.nextInt());
        }
    }

    public static void printSqu(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

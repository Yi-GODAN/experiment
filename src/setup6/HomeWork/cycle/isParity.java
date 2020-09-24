package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/26 18:33
 */
public class isParity {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            isParity(s.nextInt());
        } else {
            System.out.println("ERROR: input was filed!");
        }
    }

    public static void isParity(int i) {
        if (i % 2 == 0) {
            System.out.println(i + "，是偶数");
        } else {
            System.out.println(i + "，是奇数");
        }
    }
}

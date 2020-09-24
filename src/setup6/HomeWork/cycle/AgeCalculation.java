package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 10:56
 */
public class AgeCalculation {

    public static void main(String[] args) {
        int down = 0;
        int up = 0;

        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("请输入第" + i + "位顾客的年龄：");
            int age = s.nextInt();
            if (age <= 30) {
                down++;
            } else {
                up++;
            }
        }
        System.out.println("30岁以下的比例是：" + (down / 10.0)*100 + "%");
        System.out.println("30岁以上的比例是：" + (up / 10.0)*100 + "%");
    }
}

package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/27 10:17
 */
public class If {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextFloat()) {
            float f = s.nextFloat();
            if (f >= 90 & f <= 100){
                System.out.println("买电脑");
            } else if (f >= 80 & f < 90) {
                System.out.println("买手机");
            } else if (f >= 60 & f < 80) {
                System.out.println("吃大餐");
            } else if (f >= 0 & f < 60) {
                System.out.println("买学习资料");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("输入并非浮点数");
        }
    }
}

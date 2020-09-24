package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/26 21:17
 */
public class TestSeason {

    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            printSeason(s.nextInt());
        }
    }

    public static void printSeason(int i) {
        switch (i) {
            case 1 :
                System.out.println("春天-春暖花卡  春意盎然-植树 踏青");
                break;
            case 2 :
                System.out.println("夏天-夏日炎炎   夏日海滩-游泳  吃雪糕");
                break;
            case 3 :
                System.out.println("秋天-");
                break;
            default :
                System.out.println("没有这个季节 0.0");
        }
    }
}

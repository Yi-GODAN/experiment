package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description: 这是一个测试
 * @Author: YiMing
 * @Created: 2020/07/27 15:33
 */
public class test {

    public static void main(String[] args) {
        System.out.println("请输入月份与舱位（1:头等舱；2:经济舱）：");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int season = s.nextInt();
            int plane = s.nextInt();
            switch (season) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    if (plane == 1) {
                        System.out.println("旺季 头等舱 机票价格：" + (5000 * 0.9));
                    } else if (plane == 2) {
                        System.out.println("旺季 经济舱 机票价格：" + (5000 * 0.8));
                    }
                    break;
                default:
                    if (plane == 1) {
                        System.out.println("淡季 头等舱 机票价格：" + (5000 * 0.5));
                    } else if (plane == 2) {
                        System.out.println("淡季 经济舱 机票价格：" + (5000 * 0.4));
                    }
            }
        }
    }
}

package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/29 15:05
 */
public class Test5 {

    public static void main(String[] args) {

        System.out.print("请输入十进制浮点数：");
        Scanner s = new Scanner(System.in);
        double i = s.nextDouble();
        String str1 = IntNum((int)i);
        String str2 = littleNum(i % 1);

        System.out.println("二进制整数为：" + str1);
        System.out.println("二进制小数为：" + str2);
        System.out.println("二进制浮点数为：" + str1 + "." + str2);

    }

    /**
     * 十进制整数转二进制整数
     * @param n
     * @return String
     */
    public static String IntNum(int n) {
        String str = "";
        while (n != 0) {
            int i = n % 2;
            str = i + str;
            n = n / 2;
        }
        return str;
    }

    /**
     * 十进制小数转二进制小数
     * @param n
     * @return String
     */
    public static String littleNum(double n) {
        String str = "";
        while (n != 0) {
            n *= 2;
            str += ((int) n % 10);
            n = (n - ((int) n % 10));
        }
        return str;
    }
}

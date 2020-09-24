package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/26 21:28
 */
public class primeNumber {

    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            if (isPrime(s.nextInt())) {
                System.out.println("是素数");
            } else {
                System.out.println("不是素数");
            }
        } else {
            System.out.println("输入并非一个正整数");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

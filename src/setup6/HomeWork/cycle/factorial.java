package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 12:28
 */
public class factorial {

    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        long sum = 0;
        long sum2 = 0;
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                sum += printFactorial(i);
            }
            for (int i = 1; i <= n; i++) {
                sum2 += printFactorialFor(i);
            }
        }
        System.out.println(sum);
        System.out.println(sum2);
    }

    public static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return printFactorial(n - 1)*n;
        }
    }

    public static int printFactorialFor(int n) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i;
        }
        return m;
    }

}

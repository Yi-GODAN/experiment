package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 22:12
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Fibonacci(s.nextInt()));
    }

    public static int Fibonacci(int i) {
        if (i == 1 || i == 2)  {
            return 1;
        } else {
            return Fibonacci(i - 1) + Fibonacci(i - 2);
        }
    }
}

package setup6.HomeWork.Except;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/05 22:00
 */
public class ExceptionDemo {
    /**
     * 判断在整个调用的过程中，外层的调用方法是否有对异常的处理，如果有，直接使用throws
     * 如果没有则须使用try...catch...finally
     */
    public static void main(String[] args) {
        try {
            System.out.print("请输入1~3之间任意一个数组：");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Java");
                        break;
                    case 2:
                        System.out.println("Java");
                        break;
                    case 3:
                        System.out.println("Java");
                        break;
                    default:
                        System.out.println("输入不在1~3之间");
                }
            }
        } catch (NoSuchElementException nse) {
            System.out.println("input is exhausted");
            nse.printStackTrace();
        } catch (IllegalStateException ise) {
            System.out.println("输入值不为整数");
            ise.printStackTrace();
        } finally {
            System.out.println("欢迎提出建议");
        }
    }
}

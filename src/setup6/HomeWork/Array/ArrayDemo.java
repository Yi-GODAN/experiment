package setup6.HomeWork.Array;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description: 数组
 * @Author: YiMing
 * @Created: 2020/08/04 10:10
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] array = new int[7];
        array[0] = 8;
        array[1] = 4;
        array[2] = 2;
        array[3] = 1;
        array[4] = 23;
        array[5] = 344;
        array[6] = 1;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            sum += array[i];
        }

        System.out.println("请输入任意数字：");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println(isNum(array, num));


    }

    public static String isNum(int[] array, int n) {
        while (true) {
            for (int i = 0; i < array.length; i++) {
                if (n == array[i]) {
                    return "true";
                }
            }
        }
    }
}

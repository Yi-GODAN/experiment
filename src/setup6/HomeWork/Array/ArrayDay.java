package setup6.HomeWork.Array;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 20:12
 */
public class ArrayDay {

    public static void main(String[] args) {
        System.out.println("请输入年月日：");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int yeas = s.nextInt();
            int month = s.nextInt();
            int day = s.nextInt();
            if (yeas % 4 == 0 || yeas % 400 == 0) {
                int[] array = isLeapYear();
                int sum = 0;
                if (month > 0 & month < 13) {
                    for (int i = 0; i < month - 1; i++) {
                        sum += array[i];
                    }
                    if (day > 0 & day <= array[month - 1]) {
                        System.out.println(yeas + "为闰年，" + month + "月的第" + day + "是这一年的第" + (sum + day));
                    }
                }
            } else {
                int[] array = isLeapYear();
                int sum = 0;
                if (month > 0 & month < 13) {
                    for (int i = 0; i < array[month - 1]; i++) {
                        sum += array[i];
                    }
                    System.out.println(yeas + "为平年，" + month + "月的第" + day + "是这一年的第" + sum);
                }
            }
        }
    }

    public static int[] isLeapYear() {
        int[] leap = new int[12];
        leap[0] = 31;
        leap[1] = 29;
        leap[2] = 31;
        leap[3] = 30;
        leap[4] = 31;
        leap[5] = 30;
        leap[6] = 31;
        leap[7] = 31;
        leap[8] = 30;
        leap[9] = 31;
        leap[10] = 30;
        leap[11] = 31;
        return leap;
    }

    public static int[] isNormalYear() {
        int[] normal = new int[12];
        normal[0] = 31;
        normal[1] = 28;
        normal[2] = 31;
        normal[3] = 30;
        normal[4] = 31;
        normal[5] = 30;
        normal[6] = 31;
        normal[7] = 31;
        normal[8] = 30;
        normal[9] = 31;
        normal[10] = 30;
        normal[11] = 31;
        return normal;
    }
}

package setup6.HomeWork.Array;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/04 18:13
 */
public class RandomArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        if (s.hasNextInt()) {
            isMaxAndMin(s.nextInt());
        }
    }

    public static void isMaxAndMin(int n) {
        // 定义数组
        int[] arrays = new int[50];
        // 初始化
        for (int i = 0; i < 50; i++) {
            int num = (int) (n * Math.random());
            arrays[i] = num;
        }
        // 冒泡排序
        int temp = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }

        System.out.println("最大值为：" + arrays[49]);
        System.out.println("最小值为：" + arrays[0]);

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] >= 60) {
                int index = i;
                System.out.println("其中大于等于60的有" + (50 - index) + "个");
                break;
            }
        }

    }
}

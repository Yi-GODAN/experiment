package setup4;

import java.util.*;

public class RandomFunction {
    public static void main(String args[]) {
        Random random = new Random();
        int[] shu = new int[100];
        int[] gewei = new int[10];

        for (int i = 0; i < 100; i++) {
            shu[i] = random.nextInt(100);
            gewei[shu[i] % 10]++;
            System.out.print(shu[i] + " \n");
        }
        System.out.println();
        for (int i = 99; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                if (gewei[j] == i) {
                    System.out.println("个位数为" + j + "有" + i + "个");
                }
            }
        }
    }
}

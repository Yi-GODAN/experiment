package setup5;

import java.util.Arrays;
import java.util.Collections;

public class MainClass6 {

    public static void main(String[] args) {
        Integer[] number = {8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(number));
        int max = (int) Collections.max(Arrays.asList(number));

        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);
    }
}

package setup3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass67 {

    public static void main(String[] args) {
        List list = Arrays.asList("one tow three four five six one three four".split(" "));
        System.out.println(list);
        System.out.println("最大值：" + Collections.max(list));
        System.out.println("最小值：" + Collections.min(list));
    }
}

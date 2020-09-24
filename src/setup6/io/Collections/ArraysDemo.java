package setup6.io.Collections;

import java.util.Arrays;
import java.util.List;

/**
 * @Program: ThinkingInJava
 * @Description: Arrays工具类
 * @Author: YiMing
 * @Created: 2020/08/25 12:00
 */
public class ArraysDemo {

    public static void main(String[] args) {
        // 数组转换成List
        int[] array = new int[] {1, 2, 3, 4, 5};
        List<Integer> ints = Arrays.asList(1,1,3);

        // List转换成数组
        Object[] objects = ints.toArray();
    }
}

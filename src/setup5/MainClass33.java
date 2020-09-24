package setup5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass33 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("----------使用 for 循环----------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("----------使用 for-each 循环----------");
        //增强的 for 循环 for-each
        for (int element : array) {
            System.out.println(element);
        }

        System.out.println("----------for-each 循环二维数组----------");
        //遍历二维数组
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : array2) {
            for (int element : row) {
                System.out.println(element);
            }
        }

        //以三种方式遍历集合 List
        List<String> list = new ArrayList<String>();

        list.add("Google");
        list.add("FireFox");
        list.add("IE");

        System.out.println("----------方式1：for 循环----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----------方式2：使用迭代器----------");
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }

        System.out.println("----------方式3：for-each 循环----------");
        for (String str : list) {
            System.out.println(str);
        }
    }
}

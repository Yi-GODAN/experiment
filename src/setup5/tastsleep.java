package setup5;

import java.util.*;

public class tastsleep {
    public static void main(String[] args) {
        try {
            System.out.println(new Date());
            Thread.sleep(3000);
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }

        //测量时间间隔
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(3000);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference: " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}

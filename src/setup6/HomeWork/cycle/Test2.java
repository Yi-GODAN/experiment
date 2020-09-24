package setup6.HomeWork.cycle;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 11:38
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println("while:" + evenNumAndOddNumOfWhile());
        System.out.println("for:" + evenNumAndOddNumOfFor());
    }

    public static List<Integer> evenNumAndOddNumOfWhile() {
        List<Integer> list = new ArrayList<>();
        int evenSum = 0;
        int oddSum = 0;
        int i = 1;
        while(i <= 100) {
            if ((i % 2) == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            i++;
        }
        list.add(evenSum);
        list.add(oddSum);
        return list;
    }

    public static List<Integer> evenNumAndOddNumOfFor() {
        ArrayList<Integer> list = new ArrayList<>();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        list.add(evenSum);
        list.add(oddSum);
        return list;
    }
}

package setup3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class MainClass58 {

    public static void main(String[] args) {
        String[] coins = {"A", "B", "C", "D", "E"};
        List list = new ArrayList();
        for (int i = 0; i < coins.length; i++) {
            list.add(coins[i]);
        }
        ListIterator listIterator = list.listIterator();
        System.out.println("反转前");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        Collections.reverse(list);
        listIterator = list.listIterator();
        System.out.println("反转后");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}

package setup3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass57 {

    public static void main(String[] args) {
        List list = Arrays.asList("one Two three four five six one three Four".split(" "));
        System.out.println("List : " + list);
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("子列表：" + sublist);
        System.out.println("indexOdSublist : "
                + Collections.lastIndexOfSubList(list, sublist));
    }
}

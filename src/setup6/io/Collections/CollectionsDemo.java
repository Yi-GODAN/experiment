package setup6.io.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/25 10:31
 */
public class CollectionsDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aw");
        list.add("adf");
        list.add("agsh");

        Collections.addAll(list, "eadfg", "aasdfaf", "ggsdg");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else if (o1.length() < o2.length())
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        /*Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else if (o1.length() < o2.length())
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println(list);*/

        // 二分查找时需要先进行排序操作，如果没有排序，则找不到元素
        System.out.println(Collections.binarySearch(list, "adf"));

        // 逆序
        Collections.reverse(list);
        System.out.println(list);

        // 随机排序
        Collections.shuffle(list);
        System.out.println(list);

        // 将所有的元素填充为obj
        Collections.fill(list, "YiMing");
        System.out.println(list);
    }
}

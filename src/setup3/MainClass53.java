package setup3;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass53 {

    public static void main(String[] args) {
        System.out.println("集合实例！\n");
        int size;
        HashSet collection = new HashSet();
        String str1 = "Yellow";
        String str2 = "White";
        String str3 = "Green";
        String str4 = "Bule";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.println("集合数据：");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();
        if (collection.isEmpty()) {
            System.out.println("集合为空");
        } else {
            System.out.println("集合长度：" + size);
        }
        System.out.println();
    }
}

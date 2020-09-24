package setup3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// 增强for循环
public class MainClass56 {

    public static void main(String[] args) {
        // 创建一个HashMap对象，并加入了一些键值对。
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("1", "PHP");
        maps.put("2", "Java");
        maps.put("3", "C");
        maps.put("4", "C++");
        maps.put("5", "HTML");

        traditionalMethod1(maps);
        traditionalMethod2(maps);
        strongForMethod1(maps);
        strongForMethod2(maps);
        /*
         *  传统的遍历map集合的方法1：keySet()
         * traditionalMethod1(maps);
         *  传统的遍历map集合的方法2：entrySet()
         * traditionalMethod2(maps);
         *  使用for-each循环来遍历map集合方法1：keySet()
         * strongForMethod1(maps);
         *  使用for-each循环来遍历map集合方法2：entrySet()
         * strongForMethod2(maps);
         */
    }

    private static void strongForMethod2(Map<String, String> maps) {
        Set<Entry<String, String>> set = maps.entrySet();
        for (Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }

    private static void strongForMethod1(Map<String, String> maps) {
        Set<String> set = maps.keySet();
        for (String s : set) {
            String key = s;
            String value = maps.get(s);
            System.out.println(key + " : " + value);
        }
    }

    // 使用entrySet()方法，获取maps集合中的每一个键值对
    private static void traditionalMethod2(Map<String, String> maps) {
        Set<Map.Entry<String, String>> sets = maps.entrySet();
        // 取得迭代器遍历出对应的值。
        Iterator<Entry<String, String>> it = sets.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Entry<String, String>) it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }

    // 使用keySet()方法，获取maps集合中的所有键，遍历键取得所对应的值
    private static void traditionalMethod1(Map<String, String> maps) {
        Set<String> sets = maps.keySet();
        // 取得迭代器遍历出对应的值
        Iterator<String> it = sets.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = maps.get(key);
            System.out.println(key + " : " + value);
        }
    }
}

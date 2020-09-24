package setup6.HomeWork.Collection;

import java.util.*;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/16 20:57
 */
public class CollectionDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        // 遍历操作
        Set<String> keys = map.keySet();
        for (String key : keys)
            System.out.println(key + "=" + map.get(key));

        // 只能获取对应的value值，不能根据value来获取key
        Collection<Integer> values = map.values();
        for (Integer i : values)
            System.out.println(i);

        // 迭代器
        Set<String> keys2 = map.keySet();
        Iterator<String> iterator = keys2.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }

        // Map.entry
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> next = iterator1.next();
            System.out.println(next.getKey() + "--" + next.getValue());
        }
    }
}

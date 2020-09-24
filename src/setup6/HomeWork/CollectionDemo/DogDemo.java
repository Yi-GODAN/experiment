package setup6.HomeWork.CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/07 09:45
 */
public class DogDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Dog dog1 = new Dog("欧欧", 90);
        Dog dog2 = new Dog("美美", 100);
        Dog dog3 = new Dog("丽丽", 89);
        Dog dog4 = new Dog("丫丫", 99);
        map.put(dog1.getName(), dog1.getIntimacy());
        map.put(dog2.getName(), dog2.getIntimacy());
        map.put(dog3.getName(), dog3.getIntimacy());
        map.put(dog4.getName(), dog4.getIntimacy());

        // 键和值
        String key = null;
        int value = 0;
        System.out.println("共有：" + map.size() + "只狗狗\n分别是：");
        // 获取键集合的迭代器
        Iterator it = map.keySet().iterator();
        System.out.println("昵称\t" + "亲密度\t");
        while (it.hasNext()) {
            key = (String) it.next();
            value = (int) map.get(key);
            System.out.println(key + "\t" + value);
        }
        System.out.println("===================================================");
        map.remove("美美");
        map.remove("丽丽");
        Iterator it2 = map.keySet().iterator();
        System.out.println("删除之后，还有：" + map.size() + "只狗狗\n分别是");
        System.out.println("昵称\t" + "亲密度\t");
        while (it2.hasNext()) {
            key = (String) it2.next();
            value = (int) map.get(key);
            System.out.println(key + "\t" + value);
        }
    }
}

class Dog {

    private String name;
    private int Intimacy;

    public Dog(String name, int intimacy) {
        this.name = name;
        Intimacy = intimacy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntimacy() {
        return Intimacy;
    }

    public void setIntimacy(int intimacy) {
        Intimacy = intimacy;
    }
}

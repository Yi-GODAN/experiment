package setup6.io.Collections;

import java.util.*;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/25 12:02
 */
public class WorkCollections {

    public static void main(String[] args) {

        List<Worker> list = new ArrayList<>();
        list.add(new Worker("张三", (byte) 23, 3000));
        list.add(new Worker("李四", (byte) 24, 4000));
        list.add(new Worker("王五", (byte) 25, 5000));
        list.add(new Worker("麻子", (byte) 26, 6000));

        System.out.println(list);

        /*list.sort(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if (o1.getSalary() < o2.getSalary())
                    return 1;
                else if (o1.getSalary() > o2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });*/

        Collections.sort(list, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if (o1.getSalary() < o2.getSalary())
                    return 1;
                else if (o1.getSalary() > o2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });

        System.out.println(list);

        /**
         * 使用TreeSet时需要给TreeSet传递一个比较器，即指定比较规则。否则，TreeSet将不能排序，ClassCastException。
         */
        Set<Worker> set = new TreeSet<>(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if (o1.getSalary() < o2.getSalary())
                    return 1;
                else if (o1.getSalary() > o2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });
        set.add(new Worker("张三", (byte) 23, 3000));
        set.add(new Worker("张三", (byte) 23, 3000));
        set.add(new Worker("张三", (byte) 23, 3000));
        set.add(new Worker("李四", (byte) 24, 4000));
        set.add(new Worker("王五", (byte) 25, 5000));
        set.add(new Worker("麻子", (byte) 26, 6000));

        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next());
            if (!iterator.hasNext())
                System.out.println();
        }

        Map<Integer, Worker> map = new HashMap<>();
        map.put(1, new Worker("张三", (byte) 23, 3000));
        map.put(2, new Worker("李四", (byte) 24, 4000));
        map.put(3, new Worker("王五", (byte) 25, 5000));
        map.put(4, new Worker("麻子", (byte) 26, 6000));

        // 遍历操作
        Set<Integer> key = map.keySet();
        for (Integer integer : key)
            System.out.println(integer + "==" + map.get(integer));

        // 只能获取对应的value值，不能根据value来获取key
        Collection<Worker> values =map.values();
        for (Worker i : values)
            System.out.println(i);

        // 迭代器
        Set<Integer> key2 = map.keySet();
        for (Iterator iterator = key2.iterator(); iterator.hasNext(); ) {
            int i = (int) iterator.next();
            System.out.println(i + "==" + map.get(i));
        }

        // Map.Entry
        Set<Map.Entry<Integer, Worker>> entries = map.entrySet();
        for (Iterator<Map.Entry<Integer, Worker>> iterator = entries.iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, Worker> next = iterator.next();
            System.out.println(next.getKey() + "==" + next.getValue());
        }
    }
}

class Worker {

    private String name;
    private byte age;
    private double salary;

    Worker() {
    }

    public Worker(byte age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public Worker(String name, byte age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "【name:" + getName() + ", age:" + getAge() + ", salary:" + getSalary()
                + "】";
    }
}

package setup6.io.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/25 10:53
 */
public class PutAndGetEle {

    public static void main(String[] args) {

        List<HumanInFo> list = new ArrayList<>();
        list.add(new HumanInFo("张三", (byte)18, (byte)90, "北京"));
        list.add(new HumanInFo("李四", (byte)28, (byte)50, "上海"));
        System.out.println(list.get(1));

        Map<Integer, HumanInFo> map = new HashMap<>();
        map.put(1, new HumanInFo("张三", (byte)18, (byte)90, "北京"));
        map.put(2, new HumanInFo("李四", (byte)28, (byte)50, "上海"));
        System.out.println(map.get(2));
    }
}

class HumanInFo {

    private String name;
    private byte age;
    private byte weight;
    private String address;

    HumanInFo() {}

    public HumanInFo(String name, byte age, byte weight, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
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

    public byte getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "[name:" + getName() + ", age:" + getAge() + ", weight:" + getWeight()
                + ", address:" + getAddress();
    }
}

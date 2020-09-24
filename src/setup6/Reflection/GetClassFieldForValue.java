package setup6.Reflection;

import java.lang.reflect.Field;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 15:55
 */
public class GetClassFieldForValue {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object p = new People("Yi Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
    }
}

class People {
    private String name;

    public People(String name) {
        this.name = name;
    }
}

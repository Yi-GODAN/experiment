package setup6.Reflection;

import java.lang.reflect.Field;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 16:08
 */
public class SetClassFieldForValue {

    public static void main(String[] args) throws Exception {
        Person2 p = new Person2("Yi Ming");
        System.out.println(p.getName());
        Class aClass = p.getClass();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p, "xiao ming");
        System.out.println(p.getName());
    }
}

class Person2 {

    private String name;

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package setup6.Reflection;

import java.lang.reflect.Method;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 16:36
 */
public class GetClassPrivateMethod {

    public static void main(String[] args) throws Exception {
        Person3 p = new Person3();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p, "Bob");
        System.out.println(p.name);
    }
}

class Person3 {

    String name;

    public void setName(String name) {
        this.name = name;
    }
}

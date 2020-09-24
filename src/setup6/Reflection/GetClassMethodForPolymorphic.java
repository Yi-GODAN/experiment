package setup6.Reflection;

import java.lang.reflect.Method;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 16:43
 */
public class GetClassMethodForPolymorphic {

    public static void main(String[] args) throws Exception {
        //获取Person的hello方法
        Method m = Person4.class.getMethod("hello");
        //对Student实例调用hello方法
        m.invoke(new Person4());
    }
}

class Person4 {
    public void hello() {
        System.out.println("Person: hello");
    }
}

class Student extends Person4 {
    @Override
    public void hello() {
        System.out.println("Student: hello");
    }
}

package setup6.Reflection;

import java.lang.reflect.Constructor;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 16:51
 */
public class GetClassConstructorMethod {

    public static void main(String[] args) throws Exception {
        //获取构造方法Integer(int):
        Constructor<Integer> constructor1 = Integer.class.getConstructor(int.class);
        //调用构造方法:
        Integer i1 = constructor1.newInstance(123);
        System.out.println(i1);

        //获取构造方法Integer(String):
        Constructor<Integer> constructor2 = Integer.class.getConstructor(String.class);
        //调用构造方法
        Integer s1 = constructor2.newInstance("456");
        System.out.println(s1);
    }
}

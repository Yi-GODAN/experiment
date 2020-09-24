package setup6.Reflection;

import java.lang.reflect.Method;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 16:22
 */
public class GetClassMethod {

    public static void main(String[] args) throws Exception {
        //String Object
        String s = "Hello World";
        //获取String substring(int)方法，参数为int
        Method substring = String.class.getMethod("substring", int.class, int.class);
        //在substring对象上调用该方法并获取结果：
        String str = (String) substring.invoke(s, 6, 8);
        //打印调用结果
        System.out.println(str);
    }
}

package setup6.Reflection;

import java.lang.reflect.Method;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 16:31
 */
public class GetClassStaticMethod {

    public static void main(String[] args) throws Exception {

        //获取Integer.parseInt(String)方法，参数为String
        Method m = Integer.class.getMethod("parseInt", String.class);
        //调用该静态方法并调用
        Integer n = (Integer) m.invoke(null, "12345");
        //打印调用结果
        System.out.println(n);
    }
}

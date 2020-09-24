package setup6.proxy.DynamicProxy;

import setup6.proxy.StaticProxy.UserService;
import setup6.proxy.StaticProxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/23 12:29
 */
public class Client2 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // 设置变量可以保存动态代理类，默认名称以$Proxy0格式命名
        // System.getProperties().setProperty("sum.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 1. 创建被代理的对象，UserService接口的实现类
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        // 2. 获取对应的ClassLoader
        ClassLoader classLoader = userServiceImpl.getClass().getClassLoader();
        // 3. 获取所有接口的Class，这里的UserServiceImpl只实现了一个接口UserServiceImpl
        Class[] interfaces = userServiceImpl.getClass().getInterfaces();
        // 4. 创建一个将穿给代理类的调用请求处理器，处理所有的代理对象上的方法调用
        // 这里创建的是一个自定义的日志处理器，须传入实际的执行对象userServiceImpl
        InvocationHandler logHandle = new LogHandler(userServiceImpl);
        /*
        *  5. 根据上面提供的信息，创建代理对象在这个过程中，
        *     a. 首先，JDK会通过根据传入的参数信息动态地在内存中创建和.class文件等同的字节码
        *     b. 其次，根据相应的字节码转换成对应的class
        *     c. 再次，调用newInstance()创建代理实例
        */
        UserService proxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, logHandle);
        // 调用代理方法
        proxy.select();
        proxy.update();

        // 保存JDK动态代理生成的代理类，类名保存为UserServiceProxy
        // ProxyUtils.generateClassFile(userServiceImpl.getClass(), "UserServiceProxy");
    }
}

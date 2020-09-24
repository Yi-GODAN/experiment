package setup6.proxy.StaticProxy;

import java.util.Date;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/23 09:28
 */
public class UserServiceProxy implements UserService {
    private UserService target; // 被代理的对象

    public UserServiceProxy(UserService target) {
        this.target = target;
    }

    @Override
    public void select() {
        before();
        target.select();
        after();
    }

    @Override
    public void update() {
        before();
        target.update();
        after();
    }

    private void before() { //在方法之前执行
        System.out.println(String.format("log start time [%s] ", new Date()));
    }

    private void after() {  //在方法之后执行
        System.out.println(String.format("log end time [%s] ", new Date()));
    }
}

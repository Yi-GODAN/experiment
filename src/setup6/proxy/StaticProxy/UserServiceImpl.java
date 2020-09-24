package setup6.proxy.StaticProxy;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/23 09:26
 */
public class UserServiceImpl implements UserService {

    @Override
    public void select() {
        System.out.println("查询selectById");
    }

    @Override
    public void update() {
        System.out.println("更新update");
    }
}

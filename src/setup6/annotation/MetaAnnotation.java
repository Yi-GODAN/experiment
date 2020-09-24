package setup6.annotation;

import java.lang.annotation.*;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/06 12:24
 */
@MyAnnotation(name = "张三", age = 8, id = 1, likes = {"book", "music", "movie"})
public class MetaAnnotation {
    @MyAnnotation
    public void test() {

    }
}

// target 声明当前自定义的注解作用域  类、方法、变量、包
@Target({ElementType.METHOD, ElementType.TYPE})
// retention 表示当前注解适用的环境 源码、运行时
@Retention(RetentionPolicy.CLASS)
// 表示该注解是否显示在javadoc中
@Documented
// 表示当前注解是否能被继承
@Inherited
@interface MyAnnotation {

    //定义的方式看似是方法，但实际上在使用注解时，填写参数的名称，默认名称value
    //自定义注解中填写的所有方法都需要在使用注解时，添加值，可添加默认值
    String name() default "张三";
    int age() default 8;
    int id() default 1;
    String[] likes() default {"book", "music"};
}
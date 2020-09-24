package setup6.LambdaCalculus.Stream;

import java.util.stream.Stream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 21:44
 */
public class StreamOf {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        //For-Each方法相当于内部循环调用
        //可传入符合Consumer接口的void accept(T t)的方法引用：
        stream.forEach(System.out::println);
    }
}

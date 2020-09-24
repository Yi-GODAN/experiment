package setup6.LambdaCalculus.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 21:51
 */
public class StreamForArraysOrCollection {

    public static void main(String[] args) {
        Stream<String> stream1 = Arrays.stream(new String[]{"A", "B", "C"});
        Stream<String> stream2 = List.of("X", "Y", "Z").stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}

package setup6.LambdaCalculus.Stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 22:48
 */
public class StreamMap {

    public static void main(String[] args) {
        List.of("Apple ", " Orange", " PEar ", "Banana ")
                .stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .forEach(System.out::println);

        Stream<String> ss = Arrays.stream(new String[]{
                "2020-06-01", "2020-06-02", "2020-06-03", "2020-06-04"});
        ss.map(LocalDate::parse).forEach(System.out::println);
    }
}

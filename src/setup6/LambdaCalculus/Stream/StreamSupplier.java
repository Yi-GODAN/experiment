package setup6.LambdaCalculus.Stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 21:55
 */
public class StreamSupplier {

    public static void main(String[] args) {
        Stream<Integer> natual = Stream.generate(new NatualSupplier());
        //注意：无限序列必须先转换成优先序列再打印
        natual.limit(20).forEach(System.out::println);
    }
}

class NatualSupplier implements Supplier {

    int n = 0;

    @Override
    public Integer get() {
        n++;
        return n;
    }
}

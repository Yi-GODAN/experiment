package setup6.LambdaCalculus.Stream;

import java.util.function.LongSupplier;
import java.util.stream.LongStream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 22:06
 */
public class LongStreamForFibonacci {

    public static void main(String[] args) {
        LongStream ls = LongStream.generate(new Fibonacci());
        //注意：无限序列必须先转换成优先序列再打印
        ls.limit(200).forEach(System.out::println);
    }
}

class Fibonacci implements LongSupplier {

    private long n = 0;
    private long m = 1;
    private long temp;

    @Override
    public long getAsLong() {
        temp = n + m;
        n = m;
        m = temp;
        return n;
    }
}

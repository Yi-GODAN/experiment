package setup6.LambdaCalculus.Stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/03 00:54
 */
public class StreamOutPutCollection {

    public static void main(String[] args) {
        Stream<Long> s1 = Stream.generate(new NatualSupplier2());
        Stream<Long> s2 = s1.map(n -> n * n);
        Stream<Long> s3 = s2.map(n -> n - 1);
        /**
         * 因为s1是一个Long类型的序列，它的元素高达922亿个，但执行上述代码，
         * 既不会有任何内存增长，也不会有任何计算，因为转换操作只是保存了转换规则，
         * 无论我们对一个Stream转换多少次，都不会有任何实际计算发生。
         */
        System.out.println(s3); // java.util.stream.ReferencePipeline$3@312b1dae

        Stream<Long> s4 = s3.limit(10);
        s4.reduce(Long.valueOf(0), (acc, n) -> acc + n);
        /**
         * 而聚合操作则不一样，聚合操作会立刻促使Stream输出它的每一个元素，
         * 并依次纳入计算，以获得最终结果。所以，对一个Stream进行聚合操作，会触发一系列连锁反应：
         *
         * 我们对s4进行reduce()聚合计算，会不断请求s4输出它的每一个元素。因为s4的上游是s3，
         * 它又会向s3请求元素，导致s3向s2请求元素，s2向s1请求元素，最终，s1从Supplier
         * 实例中请求到真正的元素，并经过一系列转换，最终被reduce()聚合出结果。
         *
         * 可见，聚合操作是真正需要从Stream请求数据的，对一个Stream做聚合计算后，
         * 结果就不是一个Stream，而是一个其他的Java对象。
         */
        System.out.println(s4); // java.util.stream.SliceOps$1@1ddc4ec2

        Stream<String> stream = Stream.of("Apple", "", null, "Pear", "  ", "Orange");
        List<String> list = stream.filter(s -> s != null && !s.isBlank()).collect(Collectors.toList());
        System.out.println(list);
    }
}

class NatualSupplier2 implements Supplier<Long> {

    long n = 0;

    @Override
    public Long get() {
        n++;
        return n;
    }
}
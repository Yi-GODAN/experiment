package setup6.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/06 09:07
 */
public class StreamDemo {

    public static void main(String[] args) {
        // stream的生成操作
//        gen1();
//        gen2();
//        gen3();
//        gen4();
//        gen5();

        // 中间操作:如果调用方法之后返回的结果是Stream对象就意味着是中间操作
        Arrays.asList(1, 2, 3, 4, 5).stream().filter((x) -> x % 2 == 0).forEach(System.out::println);
        // 求出结构集中所有偶数的和
        long count = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter((x) -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(count);
        // 求集合中的最大值
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> max = list.stream().max((x, y) -> x - y);
        System.out.println(max.get());
        // 求集合最小值
        Optional<Integer> min = list.stream().min((x, y) -> x - y);
        System.out.println(min.get());

        System.out.println(list.stream().min((x, y) -> x - y).get());

        // 过滤操作
        Optional<Integer> any = list.stream().filter(x -> x % 2 == 0).findAny();
        System.out.println(any.get());

        Optional<Integer> first = list.stream().filter(x -> x % 2 == 0).findFirst();
        System.out.println(first.get());

        Stream<Integer> integerStream = list.stream().filter(i -> {
            System.out.println("Running Code");
            return i % 2 == 0;
        });
        System.out.println(integerStream.findAny().get());

        // 获取最大值和最小值，但不使用min和max方法
        Optional<Integer> first1 = list.stream().sorted().findFirst();
        System.out.println(first1.get());
        Optional<Integer> first2 = list.stream().sorted((a, b) -> b - a).findFirst();
        System.out.println(first2.get());

        // 按照字典序排序
        Arrays.asList("java", "c#", "python", "scala").stream().sorted().forEach(System.out::println);
        // 按照长度排序
        Arrays.asList("java", "c#", "python", "scala").stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);

        // 将集合中的元素进行过滤，同时返回一个集合对象
        list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

        // 去重操作
        Arrays.asList(1, 2, 3, 3, 3, 4, 5, 2, 1).stream().distinct().forEach(System.out::println);
        Arrays.asList(1, 2, 3, 3, 3, 4, 5, 2, 1).stream().collect(Collectors.toSet()).forEach(System.out::println);

        // 打印20-30的集合数据
        Stream.iterate(1, x -> x + 1).limit(50).skip(20).limit(10).forEach(System.out::println);

        // 求和
        String str = "11, 22, 33, 44, 55";
        System.out.println(Stream.of(str.split(", ")).mapToInt(x -> Integer.valueOf(x)).sum());
        System.out.println(Stream.of(str.split(", ")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());
        System.out.println(Stream.of(str.split(", ")).mapToInt(Integer::valueOf).sum());
        System.out.println(Stream.of(str.split(", ")).map(Integer::valueOf).mapToInt(x -> x).sum());

        // 构造引用
        String string = "java,C,python";
        Stream.of(string.split(",")).map(x -> new Person(x)).forEach(System.out::println);
        Stream.of(string.split(",")).map(Person::new).forEach(System.out::println);
        // 静态引用
        Stream.of(string.split(",")).map(x -> Person.build(x)).forEach(System.out::println);
        Stream.of(string.split(",")).map(Person::build).forEach(System.out::println);

        // 将str中的每个数值都打印出来，同时算出最终的求和结果
        System.out.println(Stream.of(str.split(", ")).peek(System.out::println).mapToInt(Integer::valueOf).sum());
    }

    // 通过数组生成
    static void gen1() {
        String[] str = {"a", "b", "c", "d"};
        Stream<String> str1 = Stream.of(str);
        str1.forEach(System.out::println);
    }

    // 通过集合生成
    static void gen2() {
        List<String> list = Arrays.asList("1", "2", "3", "4");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }

    // generate
    static void gen3() {
        Stream<Integer> generate = Stream.generate(() -> {
            int i = 1;
            return i++;
        });
        generate.limit(10).forEach(System.out::println);
    }

    // 使用Iterator
    static void gen4() {
        Stream<Integer> iterate = Stream.iterate(1, (x) -> x + 1);
        iterate.limit(10).forEach(System.out::println);
    }

    // 其他方式
    static void gen5() {
        String str = "abcdefg";
        IntStream stream = str.chars();
        stream.forEach(System.out::println);
    }
}

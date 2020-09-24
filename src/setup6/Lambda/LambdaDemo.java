package setup6.Lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 18:37
 */
public class LambdaDemo {

    public static void main(String[] args) {
        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running1....");
            }
        });
        thread.start();

        new Thread(() -> {
            System.out.println("Running2...");
        }).start();*/

//        List<String> list = Arrays.asList("Python", "Java", "JavaScript", "Scala");
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() - o2.length());
            }
        });
        for (String str : list) {
            System.out.println(str);
        }*/

        /*Collections.sort(list, (a,b) -> a.length()-b.length());
        list.forEach(System.out::println);*/

        LambdaInterface li1 = () -> get();
        LambdaInterface li2 = () -> 100;

        Consumer<String> c11 = (str) -> System.out.println(str);
        c11.accept("YiMing");

        BiFunction<String,String,Integer> bf = (x, y) -> x.length() + y.length();
        System.out.println(bf.apply("YiMing", "hansersdf"));


    }

    static int get() {
        return 1;
    }
}

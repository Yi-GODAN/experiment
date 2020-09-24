package setup6.LambdaCalculus.Stream;

import java.util.List;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 23:14
 */
public class StreamFilterGrade {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("小明", 88), new Person("小黑", 62),
                new Person("小白", 45), new Person("小黄", 78),
                new Person("小红", 99), new Person("小林", 58));
        // 请使用filter过滤出及格的同学，然后打印名字:
        people.stream()
                .filter(person -> person.score >= 60)
                .forEach(System.out::println);
    }
}

class Person {

    String name;
    int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name;
    }
}

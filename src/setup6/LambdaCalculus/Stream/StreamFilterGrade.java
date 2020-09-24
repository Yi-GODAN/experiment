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
                new Person("С��", 88), new Person("С��", 62),
                new Person("С��", 45), new Person("С��", 78),
                new Person("С��", 99), new Person("С��", 58));
        // ��ʹ��filter���˳������ͬѧ��Ȼ���ӡ����:
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

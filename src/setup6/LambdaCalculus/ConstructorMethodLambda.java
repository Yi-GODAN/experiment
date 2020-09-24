package setup6.LambdaCalculus;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 20:53
 */
public class ConstructorMethodLambda {

    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Alice", "Tom");
        List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons);
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

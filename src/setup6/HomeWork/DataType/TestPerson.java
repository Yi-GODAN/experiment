package setup6.HomeWork.DataType;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/25 12:23
 */
public class TestPerson {

    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        TestPerson person = new TestPerson();
        System.out.println("please input your name:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            person.setName(sc.next());
            System.out.println(person.getName());
        }
        System.out.println("please input your age:");
        if (sc.hasNextInt()) {
            person.setAge(sc.nextInt());
            System.out.println(person.getAge());
        }
        System.out.println("please input your sex:");
        if (sc.hasNextLine()) {
            person.setSex(sc.next());
            System.out.println(person.getSex());
        }

        print(person);
    }

    public static void print(TestPerson person) {
        System.out.println("The computer recorded that:");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSex());
    }
}

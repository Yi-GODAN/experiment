package setup6;

public class Person {
    int id, age;

    Person() {
        this.id = 0;
        this.age = 20;
    }

    Person(int age) {
        this.id = 0;
        this.age = age;
    }

    Person(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public void info() {
        System.out.println("Person.info  id: " +
                id + ", age: " + age);
    }

    public String toString() {
        return "Person";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof Person) {
                Person p = (Person) obj;
                if (this.id == p.id && this.age == p.age)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Person p1 = new Person(1, 1);
        Person p2 = new Person(1, 1);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}

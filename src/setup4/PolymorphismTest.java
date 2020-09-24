package setup4;

public class PolymorphismTest {
    public static void main(String[] args) {
        show(new Cat());        //以Cat对象调用show()
        show(new Dog());        //以Dog对象调用show()

        Animal a = new Cat();   //向上转型
        a.eat();                //调用Cat类的eat()
//        a.work();
        Cat c = (Cat) a;         //向下转型
        c.work();               //调用Cat类的work()
    }

    public static void show(Animal a) {
        a.eat();
        //类型判断
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.work();
        }
    }
}

abstract class Animal {
    abstract void eat();
//    abstract void work();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}
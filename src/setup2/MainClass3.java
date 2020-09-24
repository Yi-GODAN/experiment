package setup2;

//多态——参数化问题
public class MainClass3 {
    public static void MakeSound(Animal a) {
        a.cry();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();
        MakeSound(dog);
        MakeSound(cat);
        MakeSound(duck);

    }

}

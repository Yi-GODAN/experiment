package setup2;

//多态——批量化问题
public class MainClass2 {

    public static void main(String[] args) {
        Animal[] theAnimals = new Animal[3];
        theAnimals[0] = new Dog();
        theAnimals[1] = new Cat();
        theAnimals[2] = new Duck();
        for (int i = 0; i < 3; i++) {
            theAnimals[i].cry();
        }

    }

}

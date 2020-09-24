package setup6.HomeWork.OOP.ClassroomPractice;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/12 12:11
 */
public class TestDog {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("欢欢");
        dog.setHealthy(99);
        dog.setIntimacy(20);
        dog.setVariety(Variety.ChineseDog);

        Dog dog1 = new Dog("迎迎", 80, 30, Variety.Shepherd);

        System.out.println("昵称\t健康值\t亲密度\t品种");
        System.out.println(dog.getName() + "\t" + dog.getHealthy() + "\t" +
                "\t" + dog.getIntimacy() + "\t\t" + dog.getVariety().getVariety());
        System.out.println(dog1.getName() + "\t" + dog1.getHealthy() + "\t" +
                "\t" + dog1.getIntimacy() + "\t\t" + dog1.getVariety().getVariety());

        Dog dog2 = new Dog("蛋蛋", Variety.ChineseDog);

        System.out.println(dog2.getName() + "\t" + dog2.getHealthy() + "\t" +
                "\t" + dog2.getIntimacy() + "\t\t" + dog2.getVariety().getVariety());

    }
}

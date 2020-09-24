package setup6.HomeWork.OOP.ClassroomPractice;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/12 13:20
 */
public class PenguinTest {

    public static void main(String[] args) {
        Penguin penguin = new Penguin("小飞", 80, 2, SexEnum.MALE);
        Penguin penguin1 = new Penguin("小芳", 90, 0, SexEnum.FARMER);

        System.out.println("昵称\t健康值\t亲密度\t性别");
        System.out.println(penguin.getName() + "\t" + penguin.getHealthy() + "\t\t" + penguin.getIntimacy() + "\t\t" + penguin.getSex().getSex());
        System.out.println(penguin1.getName() + "\t" + penguin1.getHealthy() + "\t\t" + penguin1.getIntimacy() + "\t\t" + penguin1.getSex().getSex());
    }
}

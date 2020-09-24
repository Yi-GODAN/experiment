package setup6.HomeWork.OOP.ClassroomPractice;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/12 12:03
 */
public class Penguin {

    private String name;
    private int healthy;
    private int intimacy;
    private SexEnum sex;

    public Penguin() {}

    public Penguin(String name, int healthy, int intimacy, SexEnum sex) {
        this.name = name;
        this.healthy = healthy;
        this.intimacy = intimacy;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    private void action() {
        System.out.println("企鹅坐飞机！！！龙卷风摧毁停车场0.0");
    }
}

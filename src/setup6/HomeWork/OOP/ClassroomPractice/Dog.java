package setup6.HomeWork.OOP.ClassroomPractice;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/12 11:55
 */
public class Dog {

    private String name;
    private int healthy;
    private int intimacy;
    private Variety variety;

    public Dog() {}

    public Dog(String name, Variety variety) {
        this.name = name;
        this.variety = variety;
    }

    public Dog(String name, int healthy, int intimacy, Variety variety) {
        this.name = name;
        this.healthy = healthy;
        this.intimacy = intimacy;
        this.variety = variety;
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

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    private void action() {
        System.out.println("汪汪汪汪汪汪汪汪汪汪汪汪汪汪汪汪汪汪汪0.0");
    }
}

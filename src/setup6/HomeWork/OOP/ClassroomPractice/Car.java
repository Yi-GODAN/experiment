package setup6.HomeWork.OOP.ClassroomPractice;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/13 11:16
 */
public class Car {

    private String model;
    private long cost;

    public Car() {}

    public Car(String model, Long cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
}

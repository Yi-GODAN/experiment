package setup6.HomeWork.OOP.ClassroomPractice;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/13 11:24
 */
public class Bus {

    private int size;
    private long cost;

    public Bus() {}

    public Bus(int size) {
        this.size = size;
    }

    public Bus(int size, long cost) {
        this.size = size;
        this.cost = cost;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getCost() {
        return cost;
    }

    public  void setCost(long cost) {
        this.cost = cost;
    }
}

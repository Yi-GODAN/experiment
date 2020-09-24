package setup6.HomeWork.OOP;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/05 19:51
 */
public class Vehicle {

    private float speed;
    private float size;

    private void move() {

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void speedUp() {
        speed += 10;
    }

    public void  speedDown() {
        speed -= 10;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setSpeed(100);
        v.setSize(50);
        System.out.println(v.getSize() + "\t" + v.getSpeed());
        v.speedDown();
        System.out.println(v.getSize() + "\t" + v.getSpeed());
        v.speedUp();
        System.out.println(v.getSize() + "\t" + v.getSpeed());
    }
}

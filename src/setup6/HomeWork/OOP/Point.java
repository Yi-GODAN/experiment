package setup6.HomeWork.OOP;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/11 11:44
 */
public class Point {

    private double x = 0;
    private double y = 0;

    Point() {}

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double a, double b) {
        return Math.sqrt(Math.pow((getX() - a), 2) + Math.pow((getY() - b), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point point = new Point(1, 1);
        System.out.println(point.distance(0 , 0));
    }
}

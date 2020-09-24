package setup6.HomeWork.OOP;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/05 20:04
 */
public class Circle {

    private static float r;

    public Circle(float r) {
        this.r = r;
    }

    public float getArea(float r) {
        return (float) (Math.PI * Math.pow(r, 2));
    }

    public float getPerimeter(float r) {
        return (float) (2 * Math.PI * r);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.getArea(r) + "Circle perimeter: " + circle.getPerimeter(r));
    }
}

package setup3;

import java.util.Scanner;

public class Circle {
    public static double radius;
    public double perimeter;
    public double area;

    public Circle() {
        radius = 0;
    }

    public Circle(double r) {

    }

    public double getRadius() {
        System.out.println("请输入圆柱体底面半径：");
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        double n = console.nextDouble();
        radius = n;
        return radius;
    }

    public double getPerimeter() {
        perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    public double getArea() {
        area = 3.14 * Math.pow(radius, 2);
        return area;
    }

    public void disp() {
        System.out.println("圆的半径：" + radius + ",圆的周长：" + perimeter + ",圆的面积：" + area);
    }
}

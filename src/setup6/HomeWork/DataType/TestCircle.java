package setup6.HomeWork.DataType;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/25 15:05
 */
public class TestCircle {

    private double r;

    public double CircleArea(double r) {
        return Math.PI*Math.pow(r, 2.0);
    }

    public double CircleLength(double r) {
        return 2*Math.PI*r;
    }

    public static void main(String[] args) {
        System.out.println("Please input circle of half length:");
        Scanner s = new Scanner(System.in);
        if (s.hasNextDouble()) {
            double r = s.nextDouble();
            System.out.println("圆的半径为；" + r);
            System.out.println("圆的周长为：" + new TestCircle().CircleLength(r));
            System.out.println("圆的面积为：" + new TestCircle().CircleArea(r));
        } else {
            System.out.println("ERROR");
        }
    }
}

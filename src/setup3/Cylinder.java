package setup3;

import java.util.Scanner;

public class Cylinder extends Circle {
    public static double height;
    public double vol;

    public Cylinder(double r, double h) {

    }

    public double getHeight() {
        System.out.println("请输入圆柱体的高：");
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        double n = console.nextDouble();
        height = n;
        return height;
    }

    public double getVol() {
        vol = area * height;
        return vol;
    }

    public void dispVol() {
        System.out.println("圆柱体体积为：" + vol);
    }
}

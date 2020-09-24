package setup5;

import java.awt.*;

public class varargsDome {
    public static void main(String[] args) {
        //调用可变参数的方法
        printMax(34, 2, 5, 65, 35);
        printMax(new double[]{2.3, 45.0, 23.4, 35, 513.1});
        printMin(34, 2, 5, 65, 35);
        printMin(new double[]{2.3, 45.0, 23.4, 35, 513.1});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No agrument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is :" + result);

    }

    public static void printMin(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No agrument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < result) {
                result = numbers[i];
            }
        }
        System.out.println("The min value is :" + result);

    }
}

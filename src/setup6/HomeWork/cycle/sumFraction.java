package setup6.HomeWork.cycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/27 08:47
 */
public class sumFraction {

    public static void main(String[] args) {
        System.out.println("请输入5位学生的成绩：");
        Scanner s = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        if (s.hasNextDouble()) {
            for (int i = 0; i < 5; i++) {
                list.add(s.nextDouble());
            }
            System.out.println("成绩之和："+sumFraction(list));
        }
    }

    public static Double sumFraction (List<Double> list) {
        double d = 0;
        for (double n : list) {
            d += n;
        }
        return d;
    }

}

package setup5;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            sum += x;
            m += 1;
        }

        System.out.println(m + "个数的和是为：" + sum);
        System.out.println(m + "个数的平均值是为：" + (sum / m));
        scan.close();
    }
}

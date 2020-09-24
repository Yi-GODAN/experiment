package setup4;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        System.out.print("请输入相加的个数：");
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.print("请输入a的值：");
        int m = console.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];


        int sum = 0;
        for (int i = 0; i < n; i++) {
            int k = (int) Math.pow(10, i);
            b[i] = m * k;
            for (int j = 0; j < n; j++) {
                a[j] += b[i];
            }
            if (i == (n - 1)) {
                System.out.print(a[i] + "=");
            } else {
                System.out.print(a[i] + "+");
            }
            sum += a[i];
        }
        System.out.println(sum);

    }
}

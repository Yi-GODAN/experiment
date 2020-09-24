package setup5;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //从键盘输入
        int i = 0;
        float f = 0.0f;

        System.out.print("请输入整数：");
        if (scan.hasNextInt()) {
            //判断输入是否为正数
            i = scan.nextInt();
            //接收整数
            System.out.println("接收的整数为：" + i);
        } else {
            //输入错误的信息
            System.out.println("ERROR:输入数不是整数！");
        }

        System.out.print("请输入浮点数：");
        if (scan.hasNextFloat()) {
            //判断输入是否为浮点数
            f = scan.nextFloat();
            //接收浮点数
            System.out.println("接收的浮点数为：" + f);
        } else {
            //输入错误的信息
            System.out.println("ERROR:输入数不是浮点数！");
        }
        scan.close();
    }
}

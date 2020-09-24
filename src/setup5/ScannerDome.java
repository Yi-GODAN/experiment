package setup5;

import java.util.Scanner;

public class ScannerDome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //next() 接收字符串
        System.out.println("next接收字符串：");
        //判断是否还有输入
        if (scan.hasNextLine()) {
            String str1 = scan.nextLine();
            System.out.println("输入的字符串为：" + str1);
        }
        scan.close();
    }
}

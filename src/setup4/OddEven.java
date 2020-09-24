package setup4;

/*本程序的功能：输入一个整数，判断它是奇数还是偶数*/

import java.util.*;            //用于使用类 Scanner

public class OddEven {
    public static void main(String[] args) {
        int num;            /*用于存放输入的整数*/
        int rem;            /*用于存放除以2后的余数*/
        System.out.println("请输入一个整数");
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        num = console.nextInt();    /*从用户处得到该整数*/
        /*计算除以2后的余数并输出结果*/
        rem = num % 2;
        if (rem == 0)
            System.out.println("该数是偶数");
        else
            System.out.println("该数是奇数");
    }
}
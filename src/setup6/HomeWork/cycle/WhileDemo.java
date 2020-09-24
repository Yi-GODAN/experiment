package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/27 17:06
 */
public class WhileDemo {

    private static boolean flag = false;
    private static double amountsPay = 0;
    private static double actuallyPay = 0;
    private static double TShirt = 245;
    private static double TennisShorts = 570;
    private static double TennisRacket = 320;

    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.T恤        2.网球鞋      3.网球拍");
        System.out.println("******************************************");


        Scanner s = new Scanner(System.in);

        do {
            System.out.print("\n请输入商品编号：");
            int id = s.nextInt();
            System.out.print("请输入购买数量：");
            int num = s.nextInt();
            if (id == 1) {
                amountsPay += TShirt * num;
                System.out.println("T恤 ￥245   数量  " + num + "    合计  " + (TShirt * num));
                System.out.print("是否继续（y/n）");
                flag = isFlag(new Scanner(System.in));

            } else if (id == 2) {
                amountsPay += TennisShorts * num;
                System.out.println("网球鞋 ￥570   数量  " + num + "    合计  " + (TennisShorts * num));
                System.out.print("是否继续（y/n）");
                flag = isFlag(new Scanner(System.in));
            } else if (id == 3) {
                amountsPay += TennisRacket * num;
                System.out.println("网球拍 ￥320   数量  " + num + "    合计  " + (TennisRacket * num));
                System.out.print("是否继续（y/n）");
                flag = isFlag(new Scanner(System.in));
            } else {
                System.out.println("id输入错误");
            }

        } while (flag);

        System.out.println("\n折扣：" + 0.8);
        System.out.println("应付金额：" + amountsPay);
        System.out.print("实付金额：");
        Scanner s5 = new Scanner(System.in);
        if (s5.hasNextDouble()) {
            actuallyPay = s5.nextDouble();
        }
        while (actuallyPay < amountsPay) {
            System.out.print("您输入的金额小于应付金额，请重新输入：");
            Scanner s6 = new Scanner(System.in);
            if (s6.hasNextDouble()) {
                actuallyPay = s6.nextDouble();
                System.out.println("实付金额：" + actuallyPay);
            }
        }
        System.out.println("找钱：" + (actuallyPay - amountsPay));
    }

    public static boolean isFlag(Scanner scanner) {
        String s = scanner.next();
        if (s.equals("y") || s.equals("Y")) {
            return true;
        } else if (s.equals("n") || s.equals("N")){
            return false;
        } else {
            return Boolean.parseBoolean(null);
        }
    }
}

package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 16:06
 */
public class LoopInputInfo {

    public static void main(String[] args) {
        System.out.println("MyShopping 管理系统>客户信息管理>添加客户信息");

        for (int i = 0; i < 3; i++) {
            System.out.print("\n请输入会员号（4位整数）：");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            System.out.print("请输入会员生日（月/日用两位整数表示）：");
            String birthday = scanner.next();
            System.out.print("请输入会员积分：");
            int graded = scanner.nextInt();
            System.out.println("您录入的会员信息是：\n"+id + "  " + birthday + "  " + graded);
            if ((id / 1000) >= 1 & (id / 1000) <= 10) {
            } else {
                System.out.println("客户号" + id + "是无效会员号");
                System.out.println("录入信息失败");
                continue;
            }
        }
    }
}


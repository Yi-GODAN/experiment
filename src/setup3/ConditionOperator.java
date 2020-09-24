package setup3;

import java.util.Scanner;

public class ConditionOperator {

    public static void main(String[] args) {
        System.out.println("请输入分数：");
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        float n = console.nextFloat();
        String str = (n <= 100 && n >= 0 ? (n >= 90 ? "A" : (n <= 89 && n >= 60 ? "B" : "C")) : "分数输入错误！");
        System.out.println(str);

    }

}

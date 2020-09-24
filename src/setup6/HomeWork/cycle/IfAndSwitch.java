package setup6.HomeWork.cycle;

import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/26 18:47
 */
public class IfAndSwitch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
//            isIf(s.nextInt());
            isSwitch(s.nextInt());
        } else {
            System.out.println("输入并非整数");
        }
    }

    public static void isIf(int i) {
        if (i >= 90 & i <= 100) {
            System.out.println(i + "，成绩为A级");
        } else if (i >= 80 & i < 90) {
            System.out.println(i + "，成绩为B级");
        } else if (i >= 70 & i < 80) {
            System.out.println(i + "，成绩为C级");
        } else if (i >= 60 & i < 70) {
            System.out.println(i + "，成绩为D级");
        } else if (i >= 0 & i < 60) {
            System.out.println(i + "，成绩为E级");
        } else {
            System.out.println("输入数不在[0,100]区间内");
        }
    }

    public static void isSwitch(int i) {
        String grade = "E";
        switch (i / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "E";
        }
        System.out.println("score = " + i + "；grade = " + grade);
    }
}

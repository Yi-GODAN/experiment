package setup6.HomeWork.OOP.ClassroomPractice;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/14 11:48
 */
public class PerpetualCalendar {

    private static int years;   // 定义年份

    public static void main(String[] args) {

        int month = 0; // 定义月份
        int weekDay = 0; // 定义天数
        String[] days = new String[38]; //定义这个月的天数（数组日历）

        System.out.print("请输入年月日：");
        // 接收输入
        Scanner scanner = new Scanner(System.in);
        try {
            if (scanner.hasNextInt()) {
                years = scanner.nextInt();
                month = scanner.nextInt();
                weekDay = scanner.nextInt();
            }
        } catch (InputMismatchException ime) {
            ime.printStackTrace();
        } catch (NoSuchElementException see) {
            see.printStackTrace();
        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        }

        int day = dayNumber(month);

        // 设置时间
        Calendar calendar = Calendar.getInstance();
        calendar.set(years, month - 1, 0);
        // 初始化日历数组
        for (int i = 0; i < days.length; i++) {
            days[i] = "";
        }
        // 赋值
        int j = 1;
        for (int i = calendar.get(Calendar.DAY_OF_WEEK) - 1; i < days.length; i++, j++) {
            if (j <= day) {
                days[i] += j;
            }
        }
        // 表头
        System.out.println("****************************************");
        System.out.println("*****************万年历*****************");
        System.out.println("****************************************");
        System.out.print("一\t\t二\t\t三\t\t四\t\t五\t\t六\t\t日\t\t");

        // 输出日历数组
        Integer integer = weekDay;
        String str = integer.toString();
        for (int i = 0; i < days.length; i++) {
            if (i % 7 == 0) {
                System.out.println();
            }
            if (days[i].equals(str)) {
                System.out.print("*\t\t");
                continue;
            }
            System.out.print(days[i] + "\t\t");
        }
    }

    public static int dayNumber(int month) {
        int dayNumber = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayNumber = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayNumber = 30;
                break;
            case 2:
                if (isLeap(years)) {
                    dayNumber = 29;
                } else {
                    dayNumber = 28;
                }
                break;
            default:
                System.out.println("输入月份有误！");
        }
        return dayNumber;
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0 & year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

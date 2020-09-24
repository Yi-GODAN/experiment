package setup6.HomeWork.DataType;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/25 15:28
 */
public class TestDeposit {

    private static final double MONEY = 10000;

    public static void main(String[] args) {
        System.out.println("活期1年本息：" + (current(MONEY,1) + MONEY));
        System.out.println("活期2年本息：" + (current(MONEY,2) + MONEY));
        System.out.println("定期1年本息：" + (regularOneYears(MONEY,1) + MONEY));
        System.out.println("定期2年本息：" + (regularTwoYears(MONEY,2) + MONEY));
    }

    public static double current(double money, double years) {
        return Math.round(money * years * 0.0035);
    }

    public static double regularThreeMonth(double money, double month) {
        return Math.round(money * month * 0.0110);
    }

    public static double regularHalfYears(double money, double years) {
        return Math.round(money * years * 0.0130);
    }

    public static double regularOneYears(double money, double years) {
        return Math.round(money * years * 0.0150);
    }

    public static double regularTwoYears(double money, double years) {
        return Math.round(money * years * 0.0210);
    }


}

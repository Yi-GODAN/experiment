package setup6.HomeWork.cycle;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 12:48
 */
public class Binary {

    public static void main(String[] args) {
        printBinary(5);
    }

    public static void printBinary(int n) {
        String str = "";
        while (n != 0) {
            int i = n % 2;
            str = i + str;
            n = n / 2;
        }
        System.out.println(str);
    }
}

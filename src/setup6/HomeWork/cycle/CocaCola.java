package setup6.HomeWork.cycle;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/29 14:26
 */
public class CocaCola {

    public static void main(String[] args) {
        printNum(20);
    }

    public static void printNum(int n) {
        int sum = 0;
        while (n >= 3) {
            int bowl = n / 3;
            sum += bowl;
            if ((n % 3) != 0) {
                n = (n % 3);
            } else {
                n = 0;
            }
            n += bowl;
        }
        System.out.println(sum);
    }
}

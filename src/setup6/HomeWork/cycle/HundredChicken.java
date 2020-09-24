package setup6.HomeWork.cycle;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 18:17
 */
public class HundredChicken {

    public static void main(String[] args) {
        chicken();
    }

    public static void chicken() {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int k = 100 - i - j;
                if ((15 * i + 9 * j + k) == 300 & (i + j + k) == 100) {
                    System.out.println("公鸡：i = " + i + "；母鸡j = " + j + "；小鸡k = " + k);
                }
            }
        }
    }
}

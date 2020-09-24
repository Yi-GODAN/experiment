package setup6.HomeWork.cycle;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 09:11
 */
public class EvenNumber {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if ((i % 2) == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

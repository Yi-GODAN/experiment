package setup6.HomeWork.cycle;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 12:04
 */
public class Test3 {

    public static void main(String[] args) {
//        printWhile();
        printFor();
    }

    public static void printWhile() {
        int i = 1;
        int j = 1;
        while(i <= 1000) {
            if ((i % 5) == 0) {
                System.out.print(i + "\t");
                if (j == 3) {
                    System.out.println();
                    j = 0;
                }
                j ++;
            }
            i ++;
        }
    }

    public static void printFor() {
        int j = 1;
        for (int i = 1; i <=1000; i++) {
            if ((i % 5) == 0) {
                System.out.print(i + "\t");
                if (j == 3) {
                    System.out.println();
                    j = 0;
                }
                j ++;
            }
        }
    }
}

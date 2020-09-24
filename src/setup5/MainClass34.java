package setup5;

public class MainClass34 {

    static int sumVarargs(int... intArrays) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return (sum);
    }

    public static void main(String[] args) {
        int sum = 0;
        sum = sumVarargs(new int[]{10, 12, 33});
        System.out.println("数字相加之和为: " + sum);
    }
}
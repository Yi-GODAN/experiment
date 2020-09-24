package setup4;

public class Fib {
    private static int getFib(int i) {
        if (i <= 1) {
            return i;
        } else {
            return getFib(i - 1) + getFib(i - 2);
        }
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 5; n++) {
            if (getFib(n) == n) {
                System.out.println("Fn斐波那契数列第N项等于n=" + n);
            }
        }
    }
}

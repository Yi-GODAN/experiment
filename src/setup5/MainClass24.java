package setup5;

public class MainClass24 {

    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1)) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args) {
        for (long count = 0; count <= 10; count++) {
            System.out.printf("Fibonacci of %d is: %d\n", count, fibonacci(count));
        }
    }
}

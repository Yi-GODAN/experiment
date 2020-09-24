package setup3;

public class Rabbit {
    public int Fibonacci(int n) {
        if (n <= 1)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Rabbit tr = new Rabbit();
        for (int i = 0; i < 11; i++) {
            System.out.println("第" + (i + 1) + "个月，有" + tr.Fibonacci(i) + "只兔子");
        }

    }
}

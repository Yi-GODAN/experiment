package setup4;

public class test {
    public static void func(int a) {
        a = 20;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        func(a);
        System.out.println(a);
    }
}

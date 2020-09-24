package setup3;

public class FindPrimeNumber {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean a = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a == true) {
                System.out.println("素数为：" + i);
                count++;
            }
        }

        System.out.println("共有" + count + "个素数");
    }

}

package setup1;

public class BaiJi {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 33; j++) {
                if (n > (i * 5 + j * 3) && (n - i * 5 - j * 3) % 3 == 0) {
                    System.out.println("公鸡有" + i + "只，母鸡有" + j + "只，小鸡有" + ((n - 5 * i - 3 * j) / 3) + "只。");
                }
            }
        }
    }
}

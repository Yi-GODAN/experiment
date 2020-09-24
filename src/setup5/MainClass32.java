package setup5;

public class MainClass32 {

    public static void main(String[] args) {
        int[] inter = {1, 2, 3, 4, 5};
        forDisplay(inter);
        foreachDisplay(inter);
    }

    public static void forDisplay(int[] a) {
        System.out.println("使用 for 循环数组");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void foreachDisplay(int[] a) {
        System.out.println("使用 for-each 循环数组");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

package setup5;

public class MainClass9 {

    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 6, 6, 7, 2, 9, 2};
        findDuplicateInArray(my_array);
    }

    public static void findDuplicateInArray(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int k = i + 1; k < a.length; k++) {
                if (a[i] == a[k]) {
                    count++;
                }
            }
            if (count == 1)
                System.out.println("重复元素: " + a[i]);
            count = 0;
        }
    }
}

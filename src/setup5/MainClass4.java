package setup5;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass4 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");

        System.out.println("反转前排序: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后排序: " + arrayList);
    }

/*    //数组是不能使用集合的反转方法的，可以自定义方法实现数组反转：

    public static int[] reserve(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int x = 0; x < arr.length; x++) {
            arr1[x] = arr[arr.length - x - 1];
        }
        return arr1;
    }*/
}

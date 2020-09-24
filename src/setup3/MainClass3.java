package setup3;

import java.util.Collections;
import java.util.Vector;

public class MainClass3 {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "D");
        System.out.println("'D'元素的索引值是: " + index);
    }
}

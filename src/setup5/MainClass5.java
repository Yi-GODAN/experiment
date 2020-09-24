package setup5;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass5 {

    public static void main(String[] args) {
        String[] array = new String[3];

        array[0] = "Google";
        array[1] = "FireFox";
        array[2] = "IE";

        //  for
        for (int i = 0; i < 3; i++) {
            if (i != 0) System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println();

        //  for-each
        for (String str : array) {
            System.out.print(str + "\t");
        }
        System.out.println();

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("WWW");
        arrayList.add("Google");
        arrayList.add("com");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}

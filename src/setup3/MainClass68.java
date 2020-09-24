package setup3;

import java.util.Enumeration;
import java.util.Hashtable;

public class MainClass68 {

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.keys();
        Enumeration e2 = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement() + " : " + e2.nextElement());
        }
    }
}

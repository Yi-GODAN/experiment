package setup3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MainClass52 {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "1st");
        hashMap.put("2", "2nd");
        hashMap.put("3", "3rd");
        Collection c = hashMap.values();
        Iterator itr = c.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

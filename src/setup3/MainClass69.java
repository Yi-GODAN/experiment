package setup3;

import java.util.*;

public class MainClass69 {

    public static void main(String[] args) {
        List lnkList = new LinkedList();
        lnkList.add("element1");
        lnkList.add("element2");
        lnkList.add("element3");
        lnkList.add("element4");
        displayAll(lnkList);

        List aryList = new ArrayList();
        aryList.add("X");
        aryList.add("Y");
        aryList.add("Z");
        aryList.add("W");
        displayAll(aryList);

        Set hashSet = new HashSet();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");
        displayAll(hashSet);

        SortedSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        displayAll(treeSet);

        LinkedHashSet lnkHashSet = new LinkedHashSet();
        lnkHashSet.add("one");
        lnkHashSet.add("two");
        lnkHashSet.add("three");
        lnkHashSet.add("four");
        displayAll(lnkHashSet);

        Map map = new HashMap();
        map.put("key1", "I");
        map.put("key2", "am");
        map.put("key3", "bead");
        map.put("key4", "man");
        displayAll(map.keySet());
        displayAll(map.values());

        Map map2 = new TreeMap();
        map2.put("key1", "II");
        map2.put("key2", "amam");
        map2.put("key3", "beadbead");
        map2.put("key4", "manman");
        displayAll(map2.keySet());
        displayAll(map2.values());

        Map map3 = new LinkedHashMap();
        map3.put("key1", "III");
        map3.put("key2", "amamam");
        map3.put("key3", "beadbeadbead");
        map3.put("key4", "manamanman");
        displayAll(map3.keySet());
        displayAll(map3.values());

    }

    static void displayAll(Collection col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.println(str + " ");
        }
        System.out.println();
    }
}

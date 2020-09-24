package setup3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MainClass60 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Yi");
        list.add("Ming");
        list.add("hanson");
        list.add("www.google.com");
        String[] s1 = list.toArray(new String[0]);
        for (int i = 0; i < s1.length; ++i) {
            String contents = s1[i];
            System.out.println(contents);
        }
    }
}

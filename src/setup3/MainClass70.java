package setup3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass70 {

    public static void main(String[] args) {
        List list = Arrays.asList("One Two Three Four Five Six One Three Four".split(" "));
        System.out.println("List : " + list);
        //Collections 类的 replaceAll() 来替换List中所有的指定元素：
        Collections.replaceAll(list, "One", "hanson");
        System.out.println("replaceAll: " + list);
    }
}

package setup6.io.Collections;

import java.util.*;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/25 11:25
 */
public class Email {

    public static void main(String[] args) {

        String email = "aa@sohu.com, bb@163.com, cc@sina.com, dd@qq.com, ee@gmail.com";

        String[] str = email.split("[,]");
        List<String> list = new ArrayList<>();

        for (String s : str)
            list.add(s.trim());
        System.out.println(list);

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String[] s = list.get(i).split("[@]");
            map.put(s[0], "@" + s[1]);
        }

        System.out.println(map);


    }
}

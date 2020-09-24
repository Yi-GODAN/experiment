package setup6.HomeWork.DataType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/25 16:06
 */
public class TestEncryption {

    public static void main(String[] args) {
        System.out.println("请输入一个正数：");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            System.out.println("加密后的数字为：");
            for (Integer enc : encryption(s.nextInt())) {
                System.out.print(enc);
            }
            System.out.println("\n");
        }
    }

    private static List<Integer> encryption(Integer en) {
        int n;
        List<Integer> list = new ArrayList<>();
        String str = (String) en.toString();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            n = (int) c - 48;   // char 运算
            n = (n + 5) % 10;
            list.add(n);
        }
        Collections.reverse(list);  // 反转
        return list;
    }

}

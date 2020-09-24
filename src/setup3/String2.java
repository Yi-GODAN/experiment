package setup3;

import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) (ch[i] + 3);
        }
        String str1 = String.valueOf(ch);
        System.out.println(str1);

    }
}
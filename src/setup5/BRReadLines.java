package setup5;
//使用BufferedReader在控制台读取字符串

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        //使用System.io 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            if (str.equals("end")) break;
            System.out.println(str);
        } while (!str.equals("end"));
    }
}

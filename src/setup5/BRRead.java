package setup5;
//使用BufferedRead在控制台读取字符

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        //使用 System.io 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按q键退出");
        //读取字符
        do {
            c = (char) br.read();
            if (c == 'q') break;
            System.out.print(c);
        } while (c != 'q');
    }
}

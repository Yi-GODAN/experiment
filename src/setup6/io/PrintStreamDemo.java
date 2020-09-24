package setup6.io;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/27 12:13
 */
public class PrintStreamDemo {

    public static void main(String[] args) {
        PrintStream printStream = null;

        try {
//            printStream = new PrintStream(new FileOutputStream("a.txt"));
            printStream = new PrintStream(System.out);
            printStream.write("Hello world".getBytes());
            printStream.print(true);
            System.out.println();
            // 格式化输出 s:字符串  d:整数  f:浮点数
            System.out.printf("%s--%d---%.2f", "abc", 123, 111.111111);
            System.err.println("Error");
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();
    }
}

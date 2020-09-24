package setup2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass4 {

    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("PerpetualCalendar.txt"));
            out.write("Hello world!!!");
            out.close();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            // 捕捉异常后未进行任何操作
        }
    }
}

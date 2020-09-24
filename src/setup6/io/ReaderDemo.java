package setup6.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Program: ThinkingInJava
 * @Description: 字符流可以直接读取中文汉字，而字节流在处理时会出现中文乱码
 * @Author: YiMing
 * @Created: 2020/08/26 15:37
 */
public class ReaderDemo {

    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("a.txt");
            int length = 0;
            // 创建缓冲区
            char[] chars = new char[1024];
            while ((length = reader.read(chars)) != -1) {
                System.out.println(new String(chars));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

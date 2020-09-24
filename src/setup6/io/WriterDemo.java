package setup6.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Program: ThinkingInJava
 * @Description: 最保险的方式在输出流关闭之前每次都flush，让后再关闭。
 * @Author: YiMing
 * @Created: 2020/08/26 15:50
 */
public class WriterDemo {

    /**
     * 当某一个输出流对象中带有缓冲区时，就需要进行flash。
     * 不需要记住每个输出流的分类。
     */
    public static void main(String[] args) {
        File file = new File("writer.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("www.google.com\n");
            writer.write("当仁不让");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package setup6.io;

import java.io.*;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/24 18:16
 */
public class OutputStreamDemo {

    /**
     *  将abc.txt 中的数据写入到a.txt中
     */
    public static void main(String[] args) {

        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(new File("a.txt"));
            outputStream.write("YiMing".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

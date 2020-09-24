package setup6.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Program: ThinkingInJava
 * @Description: 在java中读写文件中的数据，需要使用流的概念
 * @Author: YiMing
 * @Created: 2020/08/26 11:37
 */
public class StreamDemo {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("abc.txt");
            int length = 0;
            /*每次只能读取一个字节，效率较低。可使用添加缓冲区的方式，
            每次会将数据添加到缓冲区中，当缓冲区满了之后，一次读取，
            而不是每一个字节进行读取。*/
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package setup6.io;

import java.io.*;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/24 18:21
 */
public class InputStreamDemo {

    public static void main(String[] args) {

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("abc.txt");
            int length = 0;
            // 添加缓冲区的方式进行读取，每次会将数据添加到缓冲区中，当缓冲区满了之后，一次读取，而不是每一个字节进行读取
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer, 5, 5)) != -1) {
                System.out.println(new String(buffer, 5, length));
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

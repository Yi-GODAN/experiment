package setup6.Internet.client;

import java.io.*;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 11:09
 */
public class PictureOfClient {

    public static void main(String[] args) throws IOException {

        // 将图片读取到内存中
        File file = new File("1.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);

        Socket client = new Socket("localhost", 10010);
        OutputStream clientOutputStream = client.getOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(clientOutputStream);

        int length = 0;
        while ((length = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(length);
            bufferedOutputStream.flush();
        }

        client.shutdownOutput();
        // 关闭操作
        fileInputStream.close();
        bufferedInputStream.close();
        clientOutputStream.close();
        bufferedOutputStream.close();
        client.close();
    }
}

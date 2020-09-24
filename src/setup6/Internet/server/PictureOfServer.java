package setup6.Internet.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 11:09
 */
public class PictureOfServer {

    public static void main(String[] args) throws IOException {

        // 创建serverSocket对象
        ServerSocket serverSocket = new ServerSocket(10010);
        // 获取服务器的套接字对象
        Socket server = serverSocket.accept();

        //-----------------------接收客户端的输入------------------------
        // 获取输入流对象
        InputStream serverInputStream = server.getInputStream();

        File file = new File("2.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        // 处理流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(serverInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);


        int length = 0;
        while ((length = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(length);
            bufferedOutputStream.flush();
        }

        System.out.println("接收完毕");

        server.shutdownInput();
        // 关闭操作
        serverInputStream.close();
        bufferedInputStream.close();
        fileOutputStream.close();
        bufferedOutputStream.close();
        serverSocket.close();
        server.close();
    }
}

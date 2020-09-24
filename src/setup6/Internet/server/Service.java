package setup6.Internet.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/04 20:04
 */
public class Service {

    public static void main(String[] args) {

        try {
            // 服务器需要使用ServerSocket来开放本地端口
            ServerSocket serverSocket = new ServerSocket(10086);
            // 需要接收client传输的数据，需要定义socket对象
            Socket server = serverSocket.accept();
            // 通过server获取输入对象
            InputStream inputStream = server.getInputStream();
            // 对输入流加个包装
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            // 读取对应的数据
            String str = dataInputStream.readUTF();
            System.out.println(str);
            // 关闭所有的流操作
            dataInputStream.close();
            inputStream.close();
            server.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

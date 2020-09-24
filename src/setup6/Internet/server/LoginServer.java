package setup6.Internet.server;

import setup6.Internet.Login;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 16:37
 */
public class LoginServer {

    public static void main(String[] args) throws IOException {

        // 创建serverSocket对象
        ServerSocket serverSocket = new ServerSocket(10010);
        // 获取服务器的套接字对象
        Socket server = serverSocket.accept();

        OutputStream outputStream = server.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Login login = new Login("abc", "acb");

        objectOutputStream.writeObject(login);



        server.shutdownOutput();
    }
}

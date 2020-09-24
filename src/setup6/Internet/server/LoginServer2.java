package setup6.Internet.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 16:37
 */
public class LoginServer2 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(10010);

        while (true) {
            Socket socket = serverSocket.accept();
            ThreadServer threadDemo = new ThreadServer(socket);
            new Thread(threadDemo).start();
        }
    }
}

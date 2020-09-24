package setup6.Internet.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 07:34
 */
public class server4 implements Runnable {

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(10086);
            Socket server = serverSocket.accept();
            while (true) {
                new InputOfServer().input(server);
                new OutputOfServer().Output(server);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

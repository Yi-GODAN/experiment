package setup6.Internet.client;

import java.io.IOException;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 07:34
 */
public class client4 implements Runnable{

    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost", 10086);
            while (true) {
                new OutputOfClient().output(socket);
                new InputOfClient().input(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }    }
}

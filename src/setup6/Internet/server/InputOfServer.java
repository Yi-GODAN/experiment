package setup6.Internet.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 07:51
 */
public class InputOfServer {

    public void input(Socket server) throws IOException {
        InputStream inputStream = server.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        System.out.println("client: " + dataInputStream.readUTF());
    }
}

package setup6.Internet.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 09:44
 */
public class InputOfClient {

    public void input(Socket client) throws IOException {
        InputStream inputStream = client.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        System.out.println("server: " + dataInputStream.readUTF());
    }
}

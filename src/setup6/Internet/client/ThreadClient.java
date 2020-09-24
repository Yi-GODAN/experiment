package setup6.Internet.client;

import setup6.Internet.Login;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 17:37
 */
public class ThreadClient implements Runnable {

    private Socket socket;
    private Login login;

    public ThreadClient(Socket socket) {
        this.socket = socket;
    }

    public ThreadClient(Socket socket, Login login) {
        this.socket = socket;
        this.login = login;
    }

    @Override
    public void run() {
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(login);

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            System.out.println(dataInputStream.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

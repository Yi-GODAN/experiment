package setup6.Internet.server;


import setup6.Internet.Gender;
import setup6.Internet.Person;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 12:22
 */
public class ObjectOfServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(10010);
        Socket server = serverSocket.accept();

        Person person = new Person("张三", 23, Gender.MALE);

        OutputStream outputStream = server.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(person);

        server.shutdownOutput();
        outputStream.close();
        objectOutputStream.close();
    }
}


package setup6.Internet.client;


import setup6.Internet.Person;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 12:21
 */
public class ObjectOfClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Socket client = new Socket("localhost", 10010);

        InputStream inputStream = client.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Object object = objectInputStream.readObject();
        if (object instanceof Person) {
            Person person = (Person) object;
            System.out.println(person);
        }

        client.shutdownInput();
        inputStream.close();
        objectInputStream.close();
        client.close();
    }
}
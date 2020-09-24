package setup6.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/26 21:10
 */
public class ObjectOutputStreamDemo {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;
        java.io.ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("a.txt");
            objectOutputStream = new java.io.ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeUTF("www.google.com");
            objectOutputStream.writeObject(new Person(1, "张三", "123456"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package setup6.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/26 19:25
 */
public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) {

        ByteArrayOutputStream byteArrayOutputStream = null;

        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(123);

        try {
            byteArrayOutputStream.write("www.google.com".getBytes());
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

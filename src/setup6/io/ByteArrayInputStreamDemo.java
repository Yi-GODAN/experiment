package setup6.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/26 19:17
 */
public class ByteArrayInputStreamDemo {

    public static void main(String[] args) {

        String str = "www.google.com";
        byte[] buffer = str.getBytes();
        ByteArrayInputStream byteArrayInputStream = null;

        byteArrayInputStream = new ByteArrayInputStream(buffer);
        int read = 0;
        while ((read = byteArrayInputStream.read()) != -1) {
            byteArrayInputStream.skip(1);
            System.out.print((char)read);
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

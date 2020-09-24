package setup6.io;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/26 22:02
 */
public class CharArrayReaderDemo {

    public static void main(String[] args) {

        char[] chars = "莫向外求".toCharArray();
        CharArrayReader charArrayReader = null;

        try {
            charArrayReader = new CharArrayReader(chars);
            int read = 0;
            while ((read = charArrayReader.read()) != -1) {
                System.out.println((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            charArrayReader.close();
        }
    }
}

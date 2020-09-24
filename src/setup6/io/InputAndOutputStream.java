package setup6.io;

import java.io.*;

/**
 * @Program: ThinkingInJava
 * @Description: 将abc.txt文件中的内容写入到a.txt文件中
 * @Author: YiMing
 * @Created: 2020/08/24 21:31
 */
public class InputAndOutputStream {

    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("abc.txt");
            outputStream = new FileOutputStream("a.txt");
            int length;
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

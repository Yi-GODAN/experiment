package setup6.io;

import java.io.*;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/26 18:31
 */
public class InputStreamReaderDemo {

    public static void main(String[] args) {

        File file = new File("a.txt");

        FileInputStream fileInputStream = null;
        // 读处理流
        InputStreamReader inputStreamReader = null;

        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream);
            int length = 0;
            char[] chars = new char[1024];
            // 如果数据较少，则无法占用1024个缓冲区，只需要一次读取即可。（无需循环）
            while ((length = inputStreamReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

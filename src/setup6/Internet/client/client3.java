package setup6.Internet.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/04 23:01
 */
public class client3 {

    public static void main(String[] args) throws IOException {
        // 创建客户端的套接字
        Socket client = new Socket("localhost", 10010);

        while (true) {
            //----------------------------向外进行输出---------------------------
            // 从控制台获取输入
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            if (string.equals("exit")) {
                break;
            }
            // 输出流对象
            OutputStream outputStream = client.getOutputStream();
            // 输出处理流对象
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(string);

            //-----------------------获取服务器返回的消息------------------------
            // 输入流对象
            InputStream inputStream = client.getInputStream();
            // 输入处理流对象
            DataInputStream dataInputStream = new DataInputStream(inputStream);
//            byte[] buffer = new byte[1024];
//            int length = inputStream.read(buffer);
//            System.out.println("Server: " + new String(buffer, 0, length));
            System.out.println("Server: " + dataInputStream.readUTF());
        }

    }
}

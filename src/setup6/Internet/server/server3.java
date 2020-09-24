package setup6.Internet.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/04 23:23
 */
public class server3 {

    public static void main(String[] args) throws IOException {

        // 创建服务端的ServerSocket
        ServerSocket serverSocket = new ServerSocket(10010);
        // 获取服务器的套接字对象
        Socket server = serverSocket.accept();

        while (true) {
            //-----------------------接收客户端的输入------------------------
            // 获取输入流对象
            InputStream inputStream = server.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
//            byte[] buf = new byte[1024];
//            int length = inputStream.read(buf);
//            System.out.println("Client: " + new String(buf, 0, length));
            System.out.println("Client: " + dataInputStream.readUTF());

            //------------------------返回客户端数据-------------------------
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            if (string.equals("exit"))
                break;
            OutputStream outputStream = server.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(string);
        }
    }
}

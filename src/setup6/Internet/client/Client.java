package setup6.Internet.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/04 19:46
 */
public class Client {

    public static void main(String[] args) {

        try {
            // 创建socket对象，其实是开启实现IO的虚拟接口（此接口不是java接口，而是类似网线的插槽）
            // 需要制定数据接收方的IP地址和端口号
            Socket client = new Socket("localhost", 10086);
            // 获取输出流对象，向服务端发送数据
            OutputStream outputStream = client.getOutputStream();
            // 包装输出流对象
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            // 传输数据
            dataOutputStream.writeUTF("Hello, My name is 张三");
            // 关闭流操作
            dataOutputStream.close();
            outputStream.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

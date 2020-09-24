package setup6.Internet.server;

import setup6.Internet.Login;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 17:02
 */
public class ThreadServer implements Runnable {

    private Socket socket;

    ThreadServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            Login login = (Login) objectInputStream.readObject();

            String str = "";

            if ("abc".equals(login.getUserName()) && "abc".equals(login.getPassWord())) {
                System.out.println("欢迎登录~" + login.getUserName());
                str = "登录成功\n";
            } else {
                str = "登录失败\n";
            }

            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(str);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

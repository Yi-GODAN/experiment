package setup6.Internet.client;

import setup6.Internet.Login;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 16:49
 */
public class LoginClient2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Socket client = new Socket("localhost", 10010);

        while (true) {
            Thread.sleep(500);

            Login login = new Login();
            Scanner s = new Scanner(System.in);
            System.out.println("请输入用户名：");
            login.setUserName(s.nextLine());
            System.out.println("请输入密码：");
            login.setPassWord(s.nextLine());

            ThreadClient threadClient = new ThreadClient(client, login);
            new Thread(threadClient).start();
        }
    }

}

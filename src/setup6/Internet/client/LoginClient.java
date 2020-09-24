package setup6.Internet.client;

import setup6.Internet.Login;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 16:49
 */
public class LoginClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Socket client = new Socket("localhost", 10010);

        InputStream inputStream = client.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Login login1 = (Login) objectInputStream.readObject();
        Login login2 = judgment();

        if ((login2.getUserName()).equals(login1.getUserName()) && (login2.getPassWord()).equals(login1.getPassWord())) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }

    public static Login judgment() {
        Login login = new Login("a", "a");
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名：");
        login.setUserName(s.nextLine());
        System.out.println("请输入密  码：");
        login.setPassWord(s.nextLine());
        return login;
    }
}

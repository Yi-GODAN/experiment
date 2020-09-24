package setup6.Internet.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 09:47
 */
public class OutputOfClient {

    public void output(Socket client) throws IOException {
        System.out.print("client(me): ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        OutputStream outputStream = client.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(str);
    }
}

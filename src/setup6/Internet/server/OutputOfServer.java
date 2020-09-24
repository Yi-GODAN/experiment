package setup6.Internet.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 08:03
 */
public class OutputOfServer {

    public void Output(Socket server) throws IOException {
        System.out.print("server(me): ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        OutputStream outputStream = server.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(str);
    }
}

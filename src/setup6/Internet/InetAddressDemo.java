package setup6.Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/04 18:49
 */
public class InetAddressDemo {

    public static void main(String[] args) {

        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            InetAddress name = InetAddress.getByName("DESKTOP-780MMUC");
            System.out.println(name);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

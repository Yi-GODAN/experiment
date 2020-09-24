package setup3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIp {

    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.google.com");
        } catch (UnknownHostException e) {
            System.exit(2);
        }
        System.out.println(address.getHostAddress() + " = " + address.getHostName());
        System.exit(0);
    }
}

package setup3;

import java.net.URL;

public class MainClass11 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.runoob.com/html/html-tutorial.html");
        System.out.println("URL：" + url.toString());
        System.out.println("协议：" + url.getProtocol());
        System.out.println("文件名：" + url.getFile());
        System.out.println("主机：" + url.getHost());
        System.out.println("路径：" + url.getPath());
        System.out.println("端口号：" + url.getPort());
        System.out.println("默认端口号：" + url.getDefaultPort());
    }
}

package setup3;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass7 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://127.0.0.1/test/test.html");
        URLConnection uc = url.openConnection();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        uc.setUseCaches(false);
        long timesTamp = uc.getLastModified();
        System.out.println("PerpetualCalendar.html文件最后修改时间：" + ft.format(new Date(timesTamp)));
    }
}

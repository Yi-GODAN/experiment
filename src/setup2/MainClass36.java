package setup2;

import java.io.File;
import java.util.Date;

public class MainClass36 {

    public static void main(String[] args) {
        File file = new File("D:\\ADownload\\PerpetualCalendar.txt");
        System.out.println("最后的修改时间为："
                + new Date(file.lastModified()));
    }
}

package setup5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass17 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();  //格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");  //a为am/pm的标记
        Date date = new Date();
        System.out.println("现在时间: " + sdf.format(date));
    }
}

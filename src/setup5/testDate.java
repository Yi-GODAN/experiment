package setup5;

import java.util.Date;
import java.text.*;

public class testDate {
    public static void main(String[] args) {
        //初始化对象
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        //使用toString()函数显示当前日期时间
        System.out.println("time :" + date.toString());

        //使用SimpleDateFormat()格式化时间格式
        System.out.println(String.format(String.format("SimpleDateFormat: " + ft.format(date))));
    }
}

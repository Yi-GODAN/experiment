package setup5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass19 {

    public static void main(String[] args) {
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));    //时间戳转换时间
        System.out.println("格式化结果：" + sd);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 天 HH 小时 mm 分钟 ss 秒");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果：" + sd2);

//        String sd = sdf.format(Long.parseLong(String.valueOf(timeStamp)));
//        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
//        String sd = sdf.format(timeStamp);
    }
}

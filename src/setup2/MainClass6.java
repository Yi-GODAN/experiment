package setup2;

import java.io.File;

public class MainClass6 {

    public static void main(String[] args) {
        try {
            File file = new File(".\\PerpetualCalendar.txt");
            if (file.delete()) {
                System.out.println(file.getName() + "文件已删除");
            } else {
                System.out.println("文件删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package setup2;

import java.io.File;
import java.io.IOException;

public class MainClass18 {

    public static void main(String[] args) {
        try {
            File file = new File(".\\myfile.txt");
            if (file.createNewFile())
                System.out.println("文件创建成功！");
            else
                System.out.println("Error:文件已存在");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}

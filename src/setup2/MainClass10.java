package setup2;

import java.io.File;

public class MainClass10 {

    public static void main(String[] args) {
        File f = null;

        try {
            // 创建临时文件
            f = File.createTempFile("tmp", ".txt", new File(".\\"));

            // 输出绝对路径
            System.out.println("File path: " + f.getAbsolutePath());

            // 终止后删除临时文件
            f.deleteOnExit();

            // 创建临时文件
            f = File.createTempFile("tmp", null, new File(".\\"));

            // 输出绝对路径
            System.out.println("File path: " + f.getAbsolutePath());

            // 终止后删除临时文件
            f.deleteOnExit();
        } catch (Exception e) {
            // 如果有错误输出内容
            e.printStackTrace();
        }
    }
}
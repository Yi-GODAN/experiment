package setup2;

import java.io.File;

public class MainClass20 {

    public static void main(String[] args) {
        File file1 = new File(".\\File\\demo1.txt");
        File file2 = new File(".\\java\\demo2.txt");
        if (file1.compareTo(file2) == 0) {
            System.out.println("文件路径一致！");
        } else {
            System.out.println("文件路径不一致！");
        }
    }
}

package setup2;

import java.io.File;

public class MainClass23 {

    public static void main(String[] args) {
        File file = new File(".\\testDir"); //当前目录下的 testDir 目录
        if (file.isDirectory()) {
            if (file.list().length > 0) {
                System.out.println("目录不为空！");
            } else {
                System.out.println("目录为空！");
            }
        } else {
            System.out.println("这不是一个目录！");
        }
    }
}

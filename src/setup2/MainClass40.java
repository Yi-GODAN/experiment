package setup2;

import java.io.File;

public class MainClass40 {

    public static void main(String[] args) {
        File dir = new File("D:\\ADownload");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (int i = 0; i < children.length; i++) {
                String fileName = children[i];
                System.out.println(fileName);
            }
        }
    }
}

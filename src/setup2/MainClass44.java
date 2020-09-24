package setup2;

import java.io.File;

public class MainClass44 {

    public static void main(String[] args) {
        System.out.println("遍历目录");
        File dir = new File("D:\\ADownload");
        visitAllDirsAndFiles(dir);
    }

    public static void visitAllDirsAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitAllDirsAndFiles(new File(dir, children[i]));
            }
        }
    }
}

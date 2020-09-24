package setup2;

import java.io.File;
import java.io.FilenameFilter;

public class MainClass41 {

    public static void main(String[] args) {
        File dir = new File("D:\\ADownload");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("U");
            }
        };
        String[] children = dir.list(filter);
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

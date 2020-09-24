package setup2;

import java.io.File;

public class MainClass35 {

    public static void main(String[] args) {
        File file = new File(".//src");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为: " + strParentDirectory);
    }
}

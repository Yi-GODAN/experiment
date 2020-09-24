package setup2;

import java.io.File;

public class MainClass34 {

    public static void main(String[] args) {
        File dir = new File("..\\experiment");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("该目录不存在");
        } else {
            for (int i = 0; i < children.length; i++) {
                String fileName = children[i];
                System.out.println(fileName);
            }
        }
    }
}

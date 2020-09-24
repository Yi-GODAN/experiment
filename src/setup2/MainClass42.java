package setup2;

import java.io.File;

public class MainClass42 {

    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("系统所有的根目录：");
        for (int i = 0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
    }
}

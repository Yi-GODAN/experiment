package setup6.io;

import java.io.File;

public class test {

    public static void main(String[] args) {
        File f = new File("F:\\ProgrammingSoft\\Java\\IntelliJ IDEA\\workspace\\experiment");
        tree(f);
    }

    private static void tree(File f) {
        File[] child = f.listFiles();
        for (int i = 0; i < child.length; i++) {
            System.out.println(child[i].getName());
            if (child[i].isDirectory()) {
                tree(child[i]);
            }
        }
    }
}

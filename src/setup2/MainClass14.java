package setup2;

import java.io.File;

public class MainClass14 {

    public static void main(String[] args) {
        File file = new File(".\\java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}

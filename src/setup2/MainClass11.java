package setup2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class MainClass11 {

    public static void main(String[] args) throws IOException {
        File fileToChange = new File(".\\myJavaFile.txt");
        fileToChange.createNewFile();
        Date fileTime = new Date(fileToChange.lastModified());
        System.out.println(fileTime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        fileTime = new Date(fileToChange.lastModified());
        System.out.println(fileTime.toString());
    }
}

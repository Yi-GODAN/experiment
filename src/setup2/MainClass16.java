package setup2;

import java.io.File;
import java.lang.reflect.Field;

public class MainClass16 {

    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File(".\\");
        file = File.createTempFile("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}

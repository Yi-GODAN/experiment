package setup2;

import java.io.File;
import java.util.Date;

public class MainClass17 {

    public static void main(String[] args) {
        File file = new File("Main.java");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}

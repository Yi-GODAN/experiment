package setup2;

import java.io.File;

public class MainClass21 {

    public static void main(String[] args) {
        String directories = ".\\PerpetualCalendar\\t";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}

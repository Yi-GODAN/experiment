package setup2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass5 {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("MoneyThread.log"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
            // 捕捉异常后未进行任何操作
        }
    }
}

package setup2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class MainClass9 {

    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("testTmp", ".txt");
        System.out.println("文件路径：" + temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建：");
        out.close();
    }
}

package setup6;

import java.io.*;

public class CoderCounter {

    static long normalLines = 0;
    static long commentLines = 0;
    static long whiteLines = 0;

    public static void main(String[] args) {
        File f = new File("F:\\ProgrammingSoft\\Java\\IntelliJ IDEA\\workspace\\experiment\\src\\setup5");
        File[] codeFiles = f.listFiles();
        for (File child : codeFiles) {
            if (child.getName().matches(".*\\.java$")) {
                parse(child);
            }
        }

        System.out.println("normalLines:" + normalLines);
        System.out.println("commentLines:" + commentLines);
        System.out.println("whiteLines:" + whiteLines);
    }

    private static void parse(File f) {
        BufferedReader br = null;
        boolean comment = false;
        try {
            br = new BufferedReader(new FileReader(f));
            String line = "";
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.matches("^[\\s&&[^\\n]]*$")) {
                    whiteLines++;
                } else if (line.startsWith("/*")) {
                    commentLines++;
                    comment = true;
                } else if (true == comment) {
                    commentLines++;
                    if (line.endsWith("*/")) {
                        comment = false;
                    }
                } else if (line.startsWith("//")) {
                    commentLines++;
                } else {
                    normalLines++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                    br = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

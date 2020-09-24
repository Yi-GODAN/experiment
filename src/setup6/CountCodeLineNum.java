package com.springboot.chapter5.main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Program: demo
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/07 19:03
 */
public class CountCodeLineNum {

    private static long whiteLines;
    private static long commentLines;
    private static long normalLines;
    private static List<File> list;

    public static void main(String[] args) {

        File file = new File("F:\\ProgrammingSoft\\Java\\IntelliJ IDEA\\workspace");

        IsDirectory(file);

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
                if (line.matches("^[\\s&&[^\\n]]*&")) {
                    whiteLines++;
                } else if (line.startsWith("/*") && !line.endsWith("*/")) {
                    commentLines++;
                    comment = true;
                } else if (line.startsWith("/*") && line.endsWith("*/")) {
                    commentLines++;
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

    public static void IsDirectory(File file) {
        File[] child = file.listFiles();
        for (int i = 0; i < child.length; i++) {
            if (child[i].isDirectory()) {
                IsDirectory(child[i]);
            } else if (child[i].getName().matches(".*\\.java$")){
                parse(child[i]);
            }
        }
    }
}

package setup6.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Program: ThinkingInJava
 * @Description: File 提供了对当前文件系统中文件的部分操作
 * @Author: YiMing
 * @Created: 2020/08/25 15:33
 */
public class FileDemo {

    private static long count;

    public static void main(String[] args) throws IOException {
        File file = new File("src/abc.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 判断文件的属性，返回boolean类型的值
        file.canExecute();
        file.canRead();
        file.canWrite();

        // 判断当前文件是否存在
        System.out.println(file.exists());

        // 获取文件名称
        System.out.println(file.getName());
        // 获取文件的绝对路径
        System.out.println(file.getAbsolutePath());
        // 获取文件的夫路径名称，如果文件的路径中只包含文件名称，则显示null
        System.out.println(file.getParent());
        // 返回文件绝对路径的规范格式
        System.out.println(file.getCanonicalPath());
        // 返回操作系统的文件分割符
        System.out.println(File.separator);

        // 无论当前文件是否存在，只要给定具体的路径，都可以返回相应的路径名称
        File file1 = new File("D:/");
        System.out.println(file1.getAbsolutePath());

        // 判断文件是否是文件或者目录
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        // 返回文件对象
        /*String[] list = file1.list();
        for (String str : list)
            System.out.println(list.toString());
		// 返回文件名
        System.out.println("----------------------");
        File[] files = file1.listFiles();
        for (File f : files)
            System.out.println(f);*/

        // 打印当前文件系统的所有盘符
        /*File[] files1 = File.listRoots();
        for (int i = 0; i < files1.length; i++) {
            System.out.println(files1[i]);
        }*/

        // 创建单级目录
        /*File file2 = new File("D:/a");
        file2.mkdir();*/
        // 创建多级目录
        /*File file3 = new File("D:/a/b/c");
        file3.mkdirs();*/

        // 循环遍历输出C盘中的所有文件的绝对路径，并统计有多少文件。
        /*File file4 = new File("F:/");
        printFile(file4);
        System.out.println("共计" + count + "个文件");*/

    }


    /**
     * 文件遍历时，会出现空指针异常，原因在于当前文件系统受保护，某些文件没有访问权限
     * @param file
     */
    public static void printFile(File file) {
        // 判断file的合法性
        if (null == file || !file.exists()) {
            return;
        }
        // 得到当前路径下文件及文件夹的file对象数组
        File[] files = file.listFiles();
        // 通过打印可以看到盘符根目录存在的隐藏文件
        System.out.println(Arrays.toString(files));
        // 如果此时使用数组来对当前目录直接操作，则会报错NullPointerException，此时需进行非空判断
        if (null == files) {
            return;
        }
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getAbsolutePath());
                count++;
            } else {
                printFile(f);
            }
        }
    }
}

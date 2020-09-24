package setup2;

import java.util.Properties;

/**
 * java中取得系统的属性的方法有两种：
 * 1、可以使用System类中的方法：public static Properties getProperties()得到系统的各种属性，
 * 该方法返回一个Properties类，这个类继承自Hashtable，在该类中定义了各种属性的键值对。
 * 2、直接使用System.getProperty(String key)获取所需的系统属性
 * 实际上两者是等价的，System.getProperty(String key)方法内部调用了System类内部声明的Properties对象的getProperty(String key)方法
 */

public class MainClass43 {

    /**
     * @param args
     */

    public static void main(String[] args) {
        //使用Properties
        Properties properties = System.getProperties();
        System.out.print("java版本号：");
        System.out.println(properties.getProperty("java.version"));
        System.out.print("java厂商：");
        System.out.println(properties.getProperty("java.vendor"));
        System.out.print("java厂商网址：");
        System.out.println(properties.getProperty("java.vendor.url"));

        System.out.println("***********");

        //直接使用System.getProperty()方法
        System.out.print("java版本号：");
        System.out.println(System.getProperty("java.version"));
        System.out.print("java厂商：");
        System.out.println(System.getProperty("java.vendor"));
        System.out.print("java厂商网址：");
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.print("用户名：");
        System.out.println(System.getProperty("user.name"));
        System.out.print("用户运行程序的当前目录：");
        System.out.println(System.getProperty("user.dir"));
        System.out.print("用户主目录：");
        System.out.println(System.getProperty("uer.home"));
        System.out.print("文件分隔符：");
        System.out.println(System.getProperty("file.separator"));   //UNIX系统中是 "/"
        System.out.print("操作系统名称：");
        System.out.println(System.getProperty("os.name"));
        System.out.print("操作系统版本号：");
        System.out.println(System.getProperty("os.version"));
    }
}

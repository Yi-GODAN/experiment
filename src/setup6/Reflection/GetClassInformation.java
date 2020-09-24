package setup6.Reflection;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 15:07
 */
public class GetClassInformation {

    public static void main(String[] args) {
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
    }

    public static void printClassInfo(Class c) {
        System.out.println("Class name: " + c.getName());
        System.out.println("Simple name: " + c.getSimpleName());
        if (c.getPackage() != null) {
            System.out.println("Package name: " + c.getPackage().getName());
        }
        System.out.println("is interface: " + c.isInterface());
        System.out.println("is enum: " + c.isEnum());
        System.out.println("is array: " + c.isArray());
        System.out.println("is primitive: " + c.isPrimitive());
    }
}

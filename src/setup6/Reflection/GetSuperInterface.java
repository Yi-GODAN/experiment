package setup6.Reflection;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 19:09
 */
public class GetSuperInterface {

    public static void main(String[] args) throws Exception {
        Class<? super Integer> superclass = Integer.class.getSuperclass();
        Class<?>[] interfaces = superclass.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i);
        }
    }
}

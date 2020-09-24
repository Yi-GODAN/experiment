package setup6.Reflection;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 19:01
 */
public class GetInterface {

    public static void main(String[] args) throws Exception {
        Class<Integer> integerClass = Integer.class;
        Class<?>[] interfaces = integerClass.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i);
        }
    }
}

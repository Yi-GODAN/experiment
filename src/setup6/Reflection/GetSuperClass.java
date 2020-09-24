package setup6.Reflection;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 18:58
 */
public class GetSuperClass {

    public static void main(String[] args) throws Exception {
        Class<Integer> integerClass = Integer.class;
        System.out.println(integerClass);
        Class<? super Integer> superclass = integerClass.getSuperclass();
        System.out.println(superclass);
        Class<? super Integer> superclass1 = superclass.getSuperclass();
        System.out.println(superclass1);
        System.out.println(superclass1.getSuperclass());
    }
}

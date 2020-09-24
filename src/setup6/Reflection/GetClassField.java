package setup6.Reflection;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 15:30
 */
public class GetClassField {

    public static void main(String[] args) throws Exception {
        Class studentClass = student.class;
        //��ȡpublic�ֶ�score
        System.out.println("studentClass.getField: " + studentClass.getField("score"));
        //��ȡ�̳е�public�ֶ�name
        System.out.println("studentClass.getField: " + studentClass.getField("name"));
        //��ȡprivate�ֶ�grade
        System.out.println("studentClass.getField: " + studentClass.getDeclaredField("grade"));
    }
}

class Person {
    public String name;
}

class student extends Person {
    public int score;
    private int grade;
}

package setup6.HomeWork.cycle;

        import java.util.Scanner;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/07/28 15:02
 */
public class Test4 {

    public static void main(String[] args) {
        System.out.println("输入学生姓名：张三");
        double sum = 0;
        double grades = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第" + i + "门课的成绩：");
            grades = s.nextInt();
            if (grades < 0) {
                System.out.println("抱歉，分数录入错误，请重新进行录入");
                break;
            } else {
                sum += grades;
            }
        }
        System.out.println("张浩的平均分是：" + (sum / 5));
    }
}

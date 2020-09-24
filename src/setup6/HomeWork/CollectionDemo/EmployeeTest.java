package setup6.HomeWork.CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/07 22:01
 */
public class EmployeeTest {

    public static void main(String[] args) {
        List<SE> list = new ArrayList<>();
        list.add(new SE(001, "YiMing", 23, GenderEnumerate.MALE, 100));
        list.add(new SE(002, "LiSi", 22, GenderEnumerate.FEMALE, 90));
        list.add(new SE(003, "WangWu", 21, GenderEnumerate.FEMALE, 70));
        list.add(new SE(004, "MaZi", 20, GenderEnumerate.MALE, 20));
        Iterator<SE> i = list.iterator();
        System.out.println("程序员共有：" + list.size() + "人，具体情况如下表：");
        System.out.println("id\t\tname\t\tage\t\tgender\tpopularity\t\t");
        for (Object obj : list) {
            SE e = (SE) obj;
            SE se = (SE) e;
            System.out.println(e.getId() + "\t\t"
                    + e.getName() + "\t\t" + e.getAge() + "\t\t" + e.getGender().getName() + "\t\t" + se.getPopularity() +
                    "\t\t");
        }
        System.out.println("======================================================");
        List<PM> list2 = new ArrayList<>();
        list2.add(new PM(001, "YiMing", 23, GenderEnumerate.MALE, 5));
        list2.add(new PM(002, "LiSi", 22, GenderEnumerate.FEMALE, 3));
        list2.add(new PM(003, "WangWu", 21, GenderEnumerate.FEMALE, 2));
        list2.add(new PM(001, "MaZi", 20, GenderEnumerate.MALE, 1));
        Iterator<PM> i2 = list2.iterator();
        System.out.println("共有：" + list2.size() + "人，具体情况如下表：");
        System.out.println("id\t\tname\t\tage\t\tgender\tworkOfYear\t\t");
        for (Object obj : list2) {
            PM e = (PM) obj;
            PM se = (PM) e;
            System.out.println(e.getId() + "\t\t"
                    + e.getName() + "\t\t" + e.getAge() + "\t\t" + e.getGender().getName() + "\t\t" + se.getWorkOfYear() +
                    "\t\t");
        }
    }
}

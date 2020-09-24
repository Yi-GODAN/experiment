package setup6.HomeWork.CollectionDemo;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/07 22:00
 */
public class PM<E> extends Employee {

    private E workOfYear;

    public PM(E id, E name, E age, GenderEnumerate gender, E workOfYear) {
        super(id, name, age, gender);
        this.workOfYear = workOfYear;
    }

    public E getWorkOfYear() {
        return workOfYear;
    }

    public void setWorkOfYear(E workOfYear) {
        this.workOfYear = workOfYear;
    }
}

package setup6.HomeWork.CollectionDemo;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/07 21:56
 */
public class SE<E> extends Employee {

    private E popularity;

    public SE(E id, E name, E age, GenderEnumerate gender, E popularity) {
        super(id, name, age, gender);
        this.setPopularity(popularity);
    }

    public E getPopularity() {
        return popularity;
    }

    public void setPopularity(E popularity) {
        this.popularity = popularity;
    }
}

package setup6.HomeWork.CollectionDemo;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/07 21:43
 */
public class Employee<E> {

    private E id;
    private E name;
    private E age;
    private GenderEnumerate gender;

    public Employee(E id, E name, E age, GenderEnumerate gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    public GenderEnumerate getGender() {
        return gender;
    }

    public void setGender(GenderEnumerate gender) {
        this.gender = gender;
    }
}

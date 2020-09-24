package setup3;

public class Student extends Person {
    private String school;

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void fun() {
        System.out.println("父类中name的属性：");
        System.out.println("父类中age的属性：");
    }
}

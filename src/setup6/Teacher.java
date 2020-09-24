package setup6;

public class Teacher extends Person {
    String title;

    Teacher() {
        this.title = "Person Teacher";
    }

    Teacher(String title) {
        this.title = title;
    }

    public void info() {
        System.out.println("Teacher.info " + title);
    }

    public String toString() {
        return "Teacher";
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else {
            if (obj instanceof Teacher) {
                Teacher t = (Teacher) obj;
                if (t.title == this.title)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Profess");
        Teacher t2 = new Teacher("Profess");

        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
    }
}

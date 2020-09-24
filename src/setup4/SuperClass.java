package setup4;

public class SuperClass {
    private int n;

    SuperClass() {
        System.out.println("SuperClass()");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

//SubClass类继承
class SubClass extends SuperClass {
    private int n;

    //自动调用父类的无参构造器
    SubClass() {
        System.out.println("SubClass()");
    }

    //自动调用父类的带有参构造器
    SubClass(int n) {
        super(300);
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }
}

//SubClass2类继承
class SubClass2 extends SuperClass {
    private int n;

    //调用父类中带有参数的构造器
    SubClass2() {
        super(300);
        System.out.println("SubClass2");
    }

    //自动调用父类的无参构造器
    SubClass2(int n) {
        System.out.println("SubClass2(int n):" + n);
        this.n = n;
    }
}

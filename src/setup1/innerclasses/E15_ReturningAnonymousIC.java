package setup1.innerclasses;

class NoDefault {
    private int i;

    public NoDefault(int i) {
        this.i = i;
    }

    public void f() {
        System.out.println("NoDefault.f");
    }
}

class Second {
    public NoDefault get(int i) {
        //Doesn't Override any methods:
        return new NoDefault(i) {
        };
    }

    public NoDefault get2(int i) {
        //Override f():
        return new NoDefault(i) {
            public void f() {
                System.out.println("Second.get2.f");
            }
        };
    }
}

public class E15_ReturningAnonymousIC {
    public static void main(String[] args) {
        Second second = new Second();
        NoDefault noDefault = second.get(47);
        noDefault.f();
        noDefault = second.get2(99);
        noDefault.f();
    }
}

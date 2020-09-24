package setup1.innerclasses;

public class E07_InnerClassAccess {
    private int i = 10;

    private void f() {
        System.out.println("E07_InnerClassAccess.f");
    }

    class Inner {
        void g() {
            i++;
            f();
        }

    }

    public void h() {
        Inner inner = new Inner();
        inner.g();
        System.out.println("i = " + i);
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        E07_InnerClassAccess e = new E07_InnerClassAccess();
        e.h();
    }
}

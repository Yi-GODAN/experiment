package setup1.innerclasses;

public class E12_AnonymousInnerClassAccess {
    private int i = 0;

    private void f() {
        System.out.println("E12_AnonymousInnerClassAccess.f");
    }

    public void h() {
        new Object() {
            void g() {
                i++;
                f();
            }
        }.g();
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        E12_AnonymousInnerClassAccess e12 = new E12_AnonymousInnerClassAccess();
        e12.h();
    }
}

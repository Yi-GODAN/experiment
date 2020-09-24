package setup1.innerclasses;

import setup1.innerclasses.exercise6.SimpleInterface;

public class E09_InnerClassMethod {
    public SimpleInterface get() {
        class SI implements SimpleInterface {
            @Override
            public void f() {
                System.out.println("E09_SI.f");
            }
        }
        return new SI();
    }

    public static void main(String[] args) {
        SimpleInterface si = new E09_InnerClassMethod().get();
        si.f();
    }
}

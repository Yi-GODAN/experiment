package setup1.innerclasses;

import setup1.innerclasses.exercise6.SimpleInterface;

public class E10_InnerClassInScope {
    public SimpleInterface get() {
        {
            class SI implements SimpleInterface {
                @Override
                public void f() {
                    System.out.println("E10_SI.f");
                }
            }
            return new SI();
        }
    }

    public static void main(String[] args) {
        SimpleInterface si = new E10_InnerClassInScope().get();
        si.f();
    }
}

package setup1.innerclasses;

import setup1.innerclasses.exercise6.SimpleInterface;

public class E13_AnonymousInnerClassInMethod {
    public SimpleInterface si() {
        return new SimpleInterface() {
            @Override
            public void f() {
                System.out.println("E13 SimpleInterface.f");
            }
        };
    }

    public static void main(String[] args) {
        E13_AnonymousInnerClassInMethod e13 = new E13_AnonymousInnerClassInMethod();
        SimpleInterface si = e13.si();
        si.f();
    }
}

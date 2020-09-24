package setup1.innerclasses;

import setup1.innerclasses.exercise6.SimpleInterface;
import setup1.innerclasses.exercise6b.SimpleClass;

public class E06_ProtectedInnerClass extends SimpleClass {
    public SimpleInterface get() {
        return new Inner();
    }

    public static void main(String[] args) {
        new E06_ProtectedInnerClass().get().f();
    }
}

package setup1.Interfaces;

interface BaseInterface {
    void f();
}

interface IntermediateInterface1 extends BaseInterface {
    void f();
}

interface IntermediateInterface2 extends BaseInterface {
    void f();
}

interface CombinedInterface extends IntermediateInterface1, IntermediateInterface2 {
    void f();
}

class CombinedImpl implements CombinedInterface {
    public void f() {
        System.out.println("CombinedImpl.f()");
    }
}

public class E13_Diamond {
    public static void main(String[] args) {
        new CombinedImpl().f();
    }
}

/**
 * Java allows multiple interface inheritance but not multiple implementation inheritance,
 * which eliminates ambiguity about which of two identical members we use when combining
 * implementations of the same base class. We replicate f( ) in the interfaces above to demonstrate
 * that Java avoids the “diamond problem” (so called because of the diamond-shaped class
 * diagram produced by multiple inheritance. C++ requires extra base-class syntax resolve the ambiguity
 * created by concrete multiple inheritance).
 */
package setup1.innerclasses;

import setup1.innerclasses.exercise6.SimpleInterface;

class Outer5 {
    private class Inner implements SimpleInterface {
        @Override
        public void f() {
            System.out.println("Outer5.f");
        }
    }

    public SimpleInterface get() {
        return new Inner();
    }

    public Inner get2() {
        return new Inner();
    }
}

public class E11_HiddenInnerClass {
    public static void main(String[] args) {
        Outer5 outer5 = new Outer5();
        SimpleInterface si = outer5.get();
        si.f();
        si = outer5.get2();
        //Won't compile -- 'Inner not visible
//        Inner i1 = outer5.get2();
//        Inner i2 = (Inner) si;
    }
}
/*The public get( ) method returns the private class Inner instance, upcast to
SimpleInterface.
Notice that get2( ) returns an object of the private class Inner. However, when
you call get2( ) from outside of Outer, you can’t use the return value’s actual
type because it’s private and visible only inside the class. You can only upcast
the return value to a visible base interface. Thus, Outer methods can use the
actual type, while methods of other classes must use the upcast result.
*/
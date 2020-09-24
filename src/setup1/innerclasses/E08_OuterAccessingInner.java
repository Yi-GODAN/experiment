//: innerclasses/E08_OuterAccessingInner.java
/****************** Exercise 8 *****************
 * Determine whether an outer class has access to
 * the private elements of its inner class.
 ***********************************************/
package setup1.innerclasses;

class Outer4 {
    class Inner {
        private int i;

        private void h() {
            System.out.println("Inner.h called");
            System.out.println("Inner.i = " + i);
        }
    }

    public void testInnerAccess() {
        Inner inner = new Inner();
        inner.i = 5;
        inner.h();
    }
}

public class E08_OuterAccessingInner {
    public static void main(String[] args) {
        Outer4 outer = new Outer4();
        outer.testInnerAccess();
    }
}

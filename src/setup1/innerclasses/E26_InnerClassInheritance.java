package setup1.innerclasses;

class WithNonDefault {
    class Inner {
        int i;

        public Inner(int i) {
            this.i = i;
        }

        public Inner() {
            i = 47;
        }

        public void f(int i) {
            System.out.println("Inner.f -- i.value = " + i);
        }
    }
}

public class E26_InnerClassInheritance {
    class Inner2 extends WithNonDefault.Inner {
        // Won't compile -- WithNonDefault not available:
        //! public Inner2(int i) {
        //!     super(i);
        //! }
        public Inner2(WithNonDefault wnd, int i) {
            wnd.super(i);
        }

        public void f(int i) {
            System.out.println("Inner2.f -- i.value = " + i);
            super.f(i);
        }
    }

    public static void main(String[] args) {
        WithNonDefault wnd = new WithNonDefault();
        E26_InnerClassInheritance ici = new E26_InnerClassInheritance();
        Inner2 i2 = ici.new Inner2(wnd, 77);
        i2.f(5);
    }
}

/**
 * We use the new expression from the outer class object to create an instance of an inner class.
 * To create an instance of one inner class inheriting from another,
 * we provide the constructor with an instance of the outer base class,
 * so creating a new Inner2 object is doubly complex.
 * However, the Inner2 object now has an intimate connection with the objects WithNonDefault and
 * E26_InnerClassInheritance; this creates a private mediation between the two.
 * (See Mediator in the design patterns literature.)
 */

package setup1.Interfaces;

import setup1.Interfaces.wonpackage.AnInterface;

public class E06_InterfacePublicMethods implements AnInterface {
    /**
     * Each of these produces a compile-time error message,
     * stating that you cannot reduce the access of the
     * base class public method in a derived class.
     */
    //! void f() {}
    //! void h() {}
    //! void g() {}

    // Complies OK:
    public void f() {
    }

    public void h() {
    }

    public void g() {
    }

    public static void main(String[] args) {
    }
}///:~

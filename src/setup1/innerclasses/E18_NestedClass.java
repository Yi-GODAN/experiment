package setup1.innerclasses;

public class E18_NestedClass {
    public static class Nested {
        void f() {
            System.out.println("Nested.f");
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.f();
    }
}

class Other {
    // Specifying the nested type outside
    // the scope of the class
    void f() {
        E18_NestedClass.Nested ne = new E18_NestedClass.Nested();
    }
}

/**
 * You can refer to just the class name when inside the method of a class with a
 * defined nested (static inner) class, but outside the class, you must specify the
 * outer class and nested class, as shown in Other, above.
 */
package setup1.innerclasses;

class B2 implements WithNested {
}

public class E20_InterfaceWithNested {
    public static void main(String[] args) {
        B2 b = new B2();
        WithNested.Nested ne = new WithNested.Nested(5);
        ne.f();
    }
}

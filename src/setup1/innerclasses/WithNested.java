package setup1.innerclasses;

public interface WithNested {
    class Nested {
        int i;

        public Nested(int i) {
            this.i = i;
        }

        public void f() {
            System.out.println("WithNested.Nested.f");
        }
    }
}

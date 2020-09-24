package setup1.innerclasses;

public class Outer3Test {

    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner oi = o.new Inner();
    }
}

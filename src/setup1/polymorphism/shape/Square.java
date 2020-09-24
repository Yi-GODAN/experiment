package setup1.polymorphism.shape;

public class Square extends Circle {
    public void draw() {
        System.out.println("Square.draw()");
    }

    public void erase() {
        System.out.println("Square.erase()");
    }
}

package setup1.polymorphism.shape;

public class Triangle extends Circle {
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

package setup1.polymorphism;

import setup1.polymorphism.newShape.*;

public class E04_NewShapeType {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle(), new Tetrahedron()};
        // Make Polymorphic method calls:
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
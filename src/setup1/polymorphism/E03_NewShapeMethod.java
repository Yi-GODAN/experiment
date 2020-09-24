package setup1.polymorphism;

import setup1.polymorphism.newShape.RandomShapeGenerator;
import setup1.polymorphism.newShape.Shape;

public class E03_NewShapeMethod {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        // Fill up the array with Shape
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }
        // Make polymorphic method calls:
        for (Shape shape : shapes) {
//            shape.draw();
//            shape.erase();
            shape.msg();
        }
    }
}



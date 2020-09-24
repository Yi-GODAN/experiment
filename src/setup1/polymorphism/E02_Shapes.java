package setup1.polymorphism;

import setup1.polymorphism.oShape.RandomShapeGenerator;
import setup1.polymorphism.shape.Shape;

public class E02_Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        // Fill up the array with shape
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }
        // Make polymorphic method calls
        for (Shape shape : shapes)
            shape.draw();
    }
}

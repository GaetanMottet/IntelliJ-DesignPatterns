package ShapeDecorators.Decorators;

import ShapeDecorators.Components.Shape;

public abstract class Decorator implements Shape {
    Shape shape ;

    public Decorator(Shape shape, int size) {
        this.shape = shape;
    }

    public Decorator(Shape shape, String name) {
        this.shape = shape;
    }

    @Override
    public String draw() {
        return shape.draw();
    }
}

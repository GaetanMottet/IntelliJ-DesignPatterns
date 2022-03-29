package ShapeDecorators.Decorators;

import ShapeDecorators.Components.Shape;

public class ColorDecorator extends Decorator {
    private Shape shape;
    private String colorName;

    public ColorDecorator(Shape shape, String color) {
        super(shape, "color");
        this.shape=shape;
        this.colorName=color;
    }

    @Override
    public String draw() {
        return this.shape.draw() + ", color is "+this.colorName;
    }
}

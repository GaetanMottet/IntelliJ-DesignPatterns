package ShapeDecorators.Decorators;

import ShapeDecorators.Components.Shape;

public class BorderDecorator extends Decorator {
    private Shape shape;
    private int borderSize;

    public BorderDecorator(Shape shape, int i) {
        super(shape, i);
        this.shape = shape;
        this.borderSize= i;
    }

    @Override
    public String draw() {
        return this.shape.draw() + ", border size is " +this.borderSize;
    }
}

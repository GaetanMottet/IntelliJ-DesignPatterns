package ShapeDecorators;

import ShapeDecorators.Components.Circle;
import ShapeDecorators.Components.Rectangle;
import ShapeDecorators.Components.Shape;
import ShapeDecorators.Components.Square;
import ShapeDecorators.Decorators.BorderDecorator;
import ShapeDecorators.Decorators.ColorDecorator;
import ShapeDecorators.Decorators.TextureDecorator;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    private static List<Shape> shapes;

    /**
     * @param args
     */
    public static void main(String[] args) {
        shapes = new ArrayList<Shape>();

        Shape shape1 = new Circle(10);
        Shape shape2 = new Square(5);
        Shape shape3 = new Rectangle(9, 3);

        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);

        for(Shape s : shapes) {
            System.out.println(s.draw());
        }

        shape1 = new BorderDecorator(shape1, 4);
        shape1 = new ColorDecorator(shape1, "Red");
        shape1 = new TextureDecorator(shape1, "points");
        shape1 = new TextureDecorator(shape1, "lines");
        shapes.add(shape1);

        shape2 = new ColorDecorator(shape2, "Green");
        shapes.add(shape2);

        shape3 = new BorderDecorator(shape3, 6);
        shapes.add(shape3);

        for(Shape s : shapes) {
            System.out.println(s.draw());
        }
    }
}

package ShapeDecorators.Components;

public class Circle implements Shape{
    int diametre ;

    public Circle(int diam) {
        this.diametre = diam ;
    }

    @Override
    public String draw() {
        return "A circle is drawn. Its diameter = " +this.diametre;
    }
}

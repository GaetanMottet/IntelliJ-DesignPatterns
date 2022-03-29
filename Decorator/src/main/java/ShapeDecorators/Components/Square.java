package ShapeDecorators.Components;

public class Square implements Shape {
    private int width ;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public String draw() {
        return "A square with " +this.width +" wide is drawn";
    }
}

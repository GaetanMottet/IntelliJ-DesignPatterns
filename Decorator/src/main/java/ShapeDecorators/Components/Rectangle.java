package ShapeDecorators.Components;

public class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length=length;
        this.width=length;
    }

    @Override
    public String draw() {
        return "A rectangle of " +this.length +" in length and " +this.width +" in length is drawn.";
    }
}

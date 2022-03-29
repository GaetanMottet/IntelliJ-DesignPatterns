package ShapeDecorators.Decorators;

import ShapeDecorators.Components.Shape;

public class TextureDecorator extends Decorator {
    private Shape shape;
    private String texture;

    public TextureDecorator(Shape shape, String textureStyle) {
        super(shape, "texture");
        this.shape=shape;
        this.texture=textureStyle;
    }

    @Override
    public String draw() {
        return this.shape.draw() +", texture is "+this.texture;
    }
}

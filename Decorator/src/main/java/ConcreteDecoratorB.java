public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        addedBehavior();
        super.operation();
    }

    private void addedBehavior() {
        System.out.println("Adding some behavior");
    }
}

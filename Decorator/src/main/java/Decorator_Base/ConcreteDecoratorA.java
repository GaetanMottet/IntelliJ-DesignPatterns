package Decorator_Base;

import Decorator_Base.Component;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("I am adding new responsibilities at runtime. ");
        super.operation();
    }
}

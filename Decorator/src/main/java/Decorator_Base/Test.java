package Decorator_Base;

import Decorator_Base.ConcreteDecoratorA;
import Decorator_Base.ConcreteDecoratorB;

public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        component.operation();
    }
}

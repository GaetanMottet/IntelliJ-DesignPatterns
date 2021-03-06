package Decorator_Base;

import Decorator_Base.Component;

public abstract class Decorator implements Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override //instead to implement in each concrete Decorator_Base.Decorator
    public void operation() {
        component.operation();
    }
}

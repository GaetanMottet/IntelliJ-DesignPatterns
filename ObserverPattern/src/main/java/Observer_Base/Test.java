package Observer_Base;

import Observer_Base.ConcreteObserver;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver(subject);

        subject.setState(88);
        subject.setState(120);
    }
}

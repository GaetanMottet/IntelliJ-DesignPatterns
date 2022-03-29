public class ConcreteObserver implements Observer{
    ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Observer was notified : subject has state: " +this.concreteSubject.getState());
    }
}

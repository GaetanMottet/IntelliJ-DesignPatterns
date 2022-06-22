package coffeeMachine_Exercice.subject;

import coffeeMachine_Exercice.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers();
}

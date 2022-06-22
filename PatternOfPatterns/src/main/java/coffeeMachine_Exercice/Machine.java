package coffeeMachine_Exercice;

import coffeeMachine_Exercice.observer.Observer;

import java.util.List;

public interface Machine {
    int getNumberOfCapsules();
    boolean isCompletelyUp();
    void stop();
    List<Observer> getOwners();
}

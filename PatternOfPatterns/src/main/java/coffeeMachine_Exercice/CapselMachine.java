package coffeeMachine_Exercice;

import coffeeMachine_Exercice.observer.Observer;
import coffeeMachine_Exercice.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class CapselMachine implements Machine, Subject {

    private List<Observer> myOwners;
    private int numberOfCapsules;
    private boolean state;

    public CapselMachine(int numberOfCapsules) {
        this.numberOfCapsules = numberOfCapsules;
        this.myOwners = new ArrayList<Observer>();
        this.state = true;
    }

    @Override
    public int getNumberOfCapsules() {
        return numberOfCapsules;
    }

    @Override
    public boolean isCompletelyUp() {
        return state;
    }

    @Override
    public void stop() {
        notifyObservers();
    }

    @Override
    public List<Observer> getOwners() {
        return myOwners;
    }

    @Override
    public void registerObserver(Observer o) {
        myOwners.add(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : myOwners){
            o.update(this);
        }
    }
}

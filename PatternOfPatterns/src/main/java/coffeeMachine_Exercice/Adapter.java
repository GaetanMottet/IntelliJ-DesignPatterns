package coffeeMachine_Exercice;

import coffeeMachine_Exercice.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements Machine {

    private OldMachine oldMachine;
    private List<Observer> emptyList;

    public Adapter(OldMachine oldMachine) {
        this.oldMachine = oldMachine;
        emptyList = new ArrayList<Observer>();
    }

    @Override
    public int getNumberOfCapsules() {
        return oldMachine.getNumberOfCapsules();
    }

    @Override
    public boolean isCompletelyUp() {
        return oldMachine.isCompletelyUp();
    }

    @Override
    public void stop() {
        oldMachine.stop();
    }

    @Override
    public List<Observer> getOwners() {
        return emptyList;
    }
}

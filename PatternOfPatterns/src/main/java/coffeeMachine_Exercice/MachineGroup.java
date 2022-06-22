package coffeeMachine_Exercice;

import coffeeMachine_Exercice.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MachineGroup implements Machine {

    private List<Machine> myMachines;

    public MachineGroup() {
        this.myMachines = new ArrayList<Machine>();
    }

    @Override
    public int getNumberOfCapsules() {

        int nb = 0;
        for(Machine m : myMachines){
            nb += m.getNumberOfCapsules();
        }

        return nb;
    }

    @Override
    public boolean isCompletelyUp() {
        boolean status = true;
        for (Machine m : myMachines){
            status = status & m.isCompletelyUp();
        }
        return status;
    }

    @Override
    public void stop() {
        for(Machine m : myMachines){
            m.stop();
        }
    }

    @Override
    public List<Observer> getOwners() {
        List<Observer> tempOwners = new ArrayList<Observer>();

        for(Machine m : myMachines){
            tempOwners.addAll(m.getOwners());
        }
        return tempOwners;
    }

    public void add(Machine m) {
        myMachines.add(m);
    }
}

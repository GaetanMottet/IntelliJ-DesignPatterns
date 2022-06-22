package coffeeMachine_Exercice.observer;

import coffeeMachine_Exercice.Machine;

public class Engineer implements Observer{

    public String name;

    public Engineer(String n) {
        this.name = n;
    }

    @Override
    public void update(Machine machine) {
        System.out.println(name + " receives information that machine " +machine +" is stopped.");
    }
}

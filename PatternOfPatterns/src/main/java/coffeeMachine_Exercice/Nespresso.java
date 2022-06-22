package coffeeMachine_Exercice;

import coffeeMachine_Exercice.observer.Engineer;

public class Nespresso {

    public static void main(String[] args) {
        Engineer pierre = new Engineer("Pedro");
        Engineer jean = new Engineer("Jean");
        Engineer paul = new Engineer("Paul");

        CapselMachine m1 = new CapselMachine(30);
        CapselMachine m2 = new CapselMachine(20);
        CapselMachine m3 = new CapselMachine(40);
        CapselMachine m4 = new CapselMachine(50);
        Machine m5 = new Adapter(new OldMachine(80));

        m1.registerObserver(pierre);
        m2.registerObserver(pierre);
        m3.registerObserver(jean);
        m4.registerObserver(paul);

        MachineGroup g1 = new MachineGroup();
        g1.add(m1);
        g1.add(m2);
        MachineGroup g2 = new MachineGroup();
        g2.add(m3);
        g2.add(m4);
        g2.add(g1);

        g2.add(m5);

        g2.getOwners();
        System.out.println("Total number of Capsules: " + g2.getNumberOfCapsules());
        System.out.println("Global up state: " + g2.isCompletelyUp());
        System.out.println("Stopping all machines ...");
        g2.stop();
        System.out.println("Global up state: " + g2.isCompletelyUp());
    }


}

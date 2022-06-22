package greekSalad_AbstFact_Decorator.decorator;

import greekSalad_AbstFact_Decorator.salad.Salad;

public class Olives extends SaladDecorator {
    private Salad mySalad;

    public Olives(Salad salad){
        this.mySalad = salad;
    }

    @Override
    public double cost(){
        return mySalad.cost() + 1;
    }

    @Override
    public String prepare() {
        return mySalad.prepare() + " + Olives ";
    }

}

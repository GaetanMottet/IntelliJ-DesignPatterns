package greekSalad_AbstFact_Decorator.factory;

import greekSalad_AbstFact_Decorator.ingredients.*;

public class ClassicGreekSaladIngredientFactory implements SaladIngredientFactory{
    @Override
    public CucumberIngredient createCucumber() {
        return new BigCucumber();
    }

    @Override
    public SaladIngredient createSalad() {
        return new IcebergSalad();
    }

    @Override
    public TomatoIngredient createTomato() {
        return new CherryTomato();
    }

    @Override
    public String getDescription() {
        return "Classic type";
    }

}

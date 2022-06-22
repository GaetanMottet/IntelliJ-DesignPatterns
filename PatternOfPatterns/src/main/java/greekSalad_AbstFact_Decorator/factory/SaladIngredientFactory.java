package greekSalad_AbstFact_Decorator.factory;

import greekSalad_AbstFact_Decorator.ingredients.CucumberIngredient;
import greekSalad_AbstFact_Decorator.ingredients.SaladIngredient;
import greekSalad_AbstFact_Decorator.ingredients.TomatoIngredient;

public interface SaladIngredientFactory {
    SaladIngredient createSalad();
    CucumberIngredient createCucumber();
    TomatoIngredient createTomato();
    String getDescription();

}

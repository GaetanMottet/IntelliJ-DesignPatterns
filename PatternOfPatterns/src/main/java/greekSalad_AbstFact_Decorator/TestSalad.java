package greekSalad_AbstFact_Decorator;

import greekSalad_AbstFact_Decorator.decorator.Olives;
import greekSalad_AbstFact_Decorator.decorator.Paprika;
import greekSalad_AbstFact_Decorator.factory.ChefSpecialIngredientFactory;
import greekSalad_AbstFact_Decorator.factory.ClassicGreekSaladIngredientFactory;
import greekSalad_AbstFact_Decorator.salad.GreekSalad;
import greekSalad_AbstFact_Decorator.salad.Salad;

import java.util.Scanner;

public class TestSalad {
    /*
    Patterns used :
Decorator
The decorator pattern is the perfect fit for the salad + topping situation.
We can add as many toppings as we like without changing the basic salad class.
The price calculation is also very easy thanks to the way the Decorator pattern works.
Abstract Factory
This exercise seems the perfect opportunity to use an Abstract Factory.
We have a family of products (the ingredients like Cucumber or Tomato)
which we need to be able to create without knowing the concrete type in advance.
This is the definition of this pattern !
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Greek Salad Palace : enter your preferred salad type");
        String type = input.nextLine();

        Salad s1 = null;

        if(type.equals("Classic"))
            s1 = new GreekSalad(new ClassicGreekSaladIngredientFactory());
        else if(type.equals("Chef Special"))
            s1 = new GreekSalad(new ChefSpecialIngredientFactory());
        else{
            System.out.println("We don't have that, sorry");
            System.exit(0);
        }

        //Add some random toppings
        s1 = new Olives(new Olives(new Paprika(s1)));

        System.out.println(s1.prepare());

        System.out.println("Cost of your salad : " + s1.cost());

    }


}

package Restaurants;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(String name){
        this.name = name; //this.name est reconnu car c'est un attribut protected dans Restaurant
    }

    @Override
    void prepareVegetables() {
        System.out.println("And good zucchini.");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Meat and pasta.");
    }

    @Override
    void prepareCheese() {
        System.out.println("Adding Parmegiano");
    }

    @Override
    void prepareDessert() {
        System.out.println("Tiramisu.");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Fine italian espresso");
    }
}

package Restaurants;

public class SwissRestaurant extends Restaurant {

    public SwissRestaurant(String name){
        this.name = name;
    }

    @Override
    void prepareVegetables() {
        System.out.println("Salade");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Raclette.");
    }

    @Override
    void prepareCheese() {
        System.out.println("Gruyère.");
    }

    @Override
    void prepareDessert() {
        System.out.println("Meringue.");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Nespresso.");
    }
}

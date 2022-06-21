package Restaurants;

public class RetaurantTests {

    public static void main(String[] args) {
        Restaurant ilGolossone = new ItalianRestaurant("Il Golossone - Zürich");
        Restaurant leVieuxChalet = new SwissRestaurant("Le Vieux Chalet - Gruyère");

        ilGolossone.prepareDinner();
        leVieuxChalet.prepareDinner();

    }
}

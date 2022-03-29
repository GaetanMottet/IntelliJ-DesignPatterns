package House_Abstract;

import House_Abstract.Houses.*;


public class ArchitectOffice {

    public static void main(String[] args) {
        House house1 = new House("Modern German house",
                new GermanHouseFactory());
        house1.buildHouse();
        house1.calculatePrice();

        House house2 = new House("Typical dutch house",
                new DutchHouseFactory());
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = new House("Swiss wood chalet",
                new SwissWoodChaletFactory());
        house3.buildHouse();
        house3.calculatePrice();
    }
}


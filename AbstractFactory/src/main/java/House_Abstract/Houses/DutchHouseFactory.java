package House_Abstract.Houses;

import House_Abstract.Products.*;

public class DutchHouseFactory implements AbstractHouse {
    @Override
    public Wall createWall() {
        return new BricksWall();
    }
}

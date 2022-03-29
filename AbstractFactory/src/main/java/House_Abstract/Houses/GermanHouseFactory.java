package House_Abstract.Houses;

import House_Abstract.Products.*;

public class GermanHouseFactory implements AbstractHouse{
    @Override
    public Wall createWall() {
        return new GlassWall();
    }
}

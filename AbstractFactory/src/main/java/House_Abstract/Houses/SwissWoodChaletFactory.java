package House_Abstract.Houses;

import House_Abstract.Products.*;

public class SwissWoodChaletFactory implements AbstractHouse{
    @Override
    public Wall createWall() {
        return new WoodWall();
    }
}

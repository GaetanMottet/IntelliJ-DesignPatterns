package House;

/**
 * Lab 4
 * @author scz
 */
public class BricksHouse extends House {

    public BricksHouse() {
        this.name = "Typical dutch house";
    }

    @Override
    protected Wall createWall() {
        return new BricksWall();
    }

}

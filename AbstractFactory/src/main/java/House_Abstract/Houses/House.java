package House_Abstract.Houses;

import House_Abstract.Products.Wall;

public class House {
    private AbstractHouse abstractHouse;

    protected String name = "";
    protected Wall southWall;
    protected Wall northWall;
    protected Wall westWall;
    protected Wall eastWall;

    public House() {

    }

    public House(String name, AbstractHouse abstractHouse) {
        this.name = name;
        this.abstractHouse = abstractHouse;
    }

    public void buildHouse() {
        southWall = abstractHouse.createWall();
        northWall = abstractHouse.createWall();
        westWall = abstractHouse.createWall();
        eastWall = abstractHouse.createWall();

        southWall.bindTo(westWall);
        westWall.bindTo(southWall);

        westWall.bindTo(northWall);
        northWall.bindTo(westWall);

        northWall.bindTo(eastWall);
        eastWall.bindTo(northWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);
    }

    public void calculatePrice() {
        System.out.println("Total price of " + this.name + " is " + getHousePrice());
    }

    private int getHousePrice() {
        return southWall.getPrice() + westWall.getPrice() + northWall.getPrice() + eastWall.getPrice();
    }

//    protected Wall createWall();

}

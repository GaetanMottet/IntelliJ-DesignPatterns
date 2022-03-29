package House_Abstract.Products;

import House_Abstract.Houses.AbstractHouse;

import java.util.ArrayList;
import java.util.List;


public abstract class Wall implements AbstractWall{
    protected String name;
    protected int price;
    private List<Wall> neighbours = new ArrayList<Wall>();;


    public void bindTo(Wall w) {
        neighbours.add(w);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

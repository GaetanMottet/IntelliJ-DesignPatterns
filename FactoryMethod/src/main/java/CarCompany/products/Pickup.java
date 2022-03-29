package CarCompany.products;

public class Pickup implements Car{
    private String color;
    private String name;

    public Pickup(String color) {
        this.color = color;
        this.name = "Pickup";
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}

package CarCompany.products;

public class Minivan implements Car {
    private String color;
    private String name;

    public Minivan(String color) {
        this.color = color;
        this.name = "Minivan";
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

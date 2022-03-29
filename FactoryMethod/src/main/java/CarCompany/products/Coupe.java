package CarCompany.products;

public class Coupe implements Car {
    private String color;
    private String name;

    public Coupe(String color) {
        this.color = color;
        this.name = "Coupé" ;
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

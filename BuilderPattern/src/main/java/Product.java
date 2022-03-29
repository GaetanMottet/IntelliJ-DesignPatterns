public class Product {

    private String PartA;
    private String PartB;
    private String PartC;

    public void setPartA(String partA) {
        this.PartA = partA;
    }

    public void setPartB(String partB) {
        this.PartB = partB;
    }

    public void setPartC(String partC) {
        this.PartC = partC;
    }

    @Override
    public String toString() {

        return this.PartA;
    }
}

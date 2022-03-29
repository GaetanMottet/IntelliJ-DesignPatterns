public abstract class Builder {
    // CAN BE AN INTERFACE ! (in this case, no need of argument below...)

    protected Product product;

    public void creatNewProduct() {
        this.product = new Product();
    }

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}

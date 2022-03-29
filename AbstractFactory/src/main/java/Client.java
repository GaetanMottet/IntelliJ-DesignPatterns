public class Client {
    private AbstractFactory abstractFactory;

    private AbstractProductA productA;
    private AbstractProductB productB;

    public Client(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void setup() {
        productA = abstractFactory.createProductA();
        productB = abstractFactory.createProductB();
    }

    @Override
    public String toString() {
        return "Client{" +
                "productA=" + productA +
                ", productB=" + productB +
                '}';
    }
}

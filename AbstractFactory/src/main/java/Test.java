public class Test {
    public static void main(String[] args) {
        Client client = new Client(new ConcreteFactory1());
        client.setup();
        System.out.println(client);
    }
}

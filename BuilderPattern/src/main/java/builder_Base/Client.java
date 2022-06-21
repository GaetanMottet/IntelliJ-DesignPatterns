package builder_Base;

import builder_Base.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.setBuilder(builder);
        director.construct();

        Product product = builder.getResult();
        System.out.println(product);
    }
}

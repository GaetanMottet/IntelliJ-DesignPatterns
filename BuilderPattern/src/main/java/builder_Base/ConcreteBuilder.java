package builder_Base;

import builder_Base.Builder;

public class ConcreteBuilder extends Builder {

    private Product product;

    @Override
    public void buildPartA() {
        System.out.println("Build Part A");
        product.setPartA("material 1");
    }

    @Override
    public void buildPartB() {
        System.out.println("Build Part B");
        product.setPartB("material 2");
    }

    @Override
    public void buildPartC() {
        System.out.println("Build Part C");
        product.setPartC("material 3");
    }
}

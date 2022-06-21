package builder_Base;

import builder_Base.Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.creatNewProduct();
        //it's not mandatory to call all methods. It depends of needs
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

}

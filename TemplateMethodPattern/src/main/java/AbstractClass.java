public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1(); //that is an operation shared by many different classes but each class can define a self comportment
        primitiveOperation2(); //that is an operation shared by many different classes but each class can define a self comportment
        concreteOperation();
        hook();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    final void concreteOperation() {
        // implementation or operation shared between all children classes
    }

    void hook() {} // CONCRETE method doing nothing !! => each subclass is free to override these but don't have to !

}

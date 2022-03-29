public class ConcreteClass extends AbstractClass{
    @Override
    void primitiveOperation1() {
        //implements "self" primitiveOperation1
        System.out.println("primitive operation 1 is done from ConcreteClass");
    }

    @Override
    void primitiveOperation2() {
        //implements "self" primitiveOperation2
        System.out.println("primitive operation 2 is done from ConcreteClass");
    }
}

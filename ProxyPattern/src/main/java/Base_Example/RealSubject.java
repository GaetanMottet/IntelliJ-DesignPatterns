package Base_Example;

public class RealSubject implements Subject{
    @Override
    public void request() {
        //implements real subject action.s
        System.out.println("Real subject action.");
    }
}

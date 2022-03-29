public class Proxy implements Subject{

    //Important : The composition of a realSubject
    private RealSubject realSubject;

    @Override
    public void request() {
        //do some job like controlling
        System.out.println("Proxy does some preliminary wordk an check");
        this.realSubject = new RealSubject(); //instance our proxy
        realSubject.request(); //ask to the proxy to do its stuff..
    }
}

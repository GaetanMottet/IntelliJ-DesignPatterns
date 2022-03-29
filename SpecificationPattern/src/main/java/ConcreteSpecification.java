public class ConcreteSpecification extends AbstractSpecification {

    //declare the attribut needed to build this concrete specification
    private final String attribut ;

    //constructor
    public ConcreteSpecification(String attribut) {
        this.attribut = attribut;
    }

    @Override
    public boolean isSatisfiedBy(ConcreteCandidate candidate) {
        //Here is the test to check the concrete specification. It returns true if it matches, false if it doesn't
        if(candidate.getAttribut() == attribut){
            return true;
        }
        return false;
    }
}

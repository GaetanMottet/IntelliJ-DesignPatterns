public class NotSpecification extends AbstractSpecification {
    //We need to instantiate 2 specifications (or rules or criteria)
    private ISpecification spec1;

    //constructor
    public NotSpecification(ISpecification spec1) {
        this.spec1 = spec1;
    }

    @Override
    public boolean isSatisfiedBy(ConcreteCandidate candidate) {

        //Here we check if the object matches both spec
        //true if it doesn't match
        return spec1.isSatisfiedBy(candidate) != true ;
    }
}

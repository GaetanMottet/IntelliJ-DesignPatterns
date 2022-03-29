public abstract class AbstractSpecification implements ISpecification {

    public abstract boolean isSatisfiedBy(ConcreteCandidate candidate) ;

    public ISpecification and(ISpecification specification) {
        return new AndSpecification(this, specification);
    }

    public ISpecification or(ISpecification specification) {
        return new OrSpecification(this, specification);
    }

    public ISpecification not(ISpecification spec) {
        return new NotSpecification(spec);
    }
}

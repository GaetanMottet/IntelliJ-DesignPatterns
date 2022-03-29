public interface ISpecification {
    boolean isSatisfiedBy(ConcreteCandidate candidate);
    ISpecification and(ISpecification spec);
    ISpecification or(ISpecification spec);
    ISpecification not(ISpecification spec);
}

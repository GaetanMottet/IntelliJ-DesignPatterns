package MyMoviesLibrary.Specifications;

import MyMoviesLibrary.Canditates.Movie;

public abstract class AbstractSpecification implements ISpecification {

    public abstract boolean isSatisfiedBy(Movie movie);

    @Override
    public ISpecification and(ISpecification specification) { return new AndSpecification(this, specification); }

    @Override
    public ISpecification or(ISpecification specification) {
        return new OrSpecification(this, specification);
    }

    @Override
    public ISpecification not(ISpecification specification) {
        return new NotSpecification(specification);
    }
}

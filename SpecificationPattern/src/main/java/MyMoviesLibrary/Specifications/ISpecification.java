package MyMoviesLibrary.Specifications;

import MyMoviesLibrary.Canditates.Movie;

public interface ISpecification {
    boolean isSatisfiedBy(Movie movie);

    ISpecification and(ISpecification specification);
    ISpecification or(ISpecification specification);
    ISpecification not(ISpecification specification);
}

package MyMoviesLibrary.Specifications;

import MyMoviesLibrary.Canditates.Movie;

public class AndSpecification extends AbstractSpecification{

    //We need to instantiate 2 specifications (or rules or criteria)
    private ISpecification spec1;
    private ISpecification spec2;

    //constructor
    public AndSpecification(ISpecification spec1, ISpecification spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    @Override
    public boolean isSatisfiedBy(Movie movie) {

        //Here we check if the objects matches both spec
        //true if it matches, false if at least one doesn't match
        return spec1.isSatisfiedBy(movie) && spec2.isSatisfiedBy(movie) ;
    }
}

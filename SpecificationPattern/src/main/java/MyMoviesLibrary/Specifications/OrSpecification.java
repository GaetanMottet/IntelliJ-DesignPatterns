package MyMoviesLibrary.Specifications;

import MyMoviesLibrary.Canditates.Movie;

public class OrSpecification extends AbstractSpecification {

    //We need to instantiate 2 specifications (we also can call it rules or criteria)
    private ISpecification spec1;
    private ISpecification spec2;

    //constructor
    public OrSpecification(ISpecification spec1, ISpecification spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    @Override
    public boolean isSatisfiedBy(Movie movie) {

        //Here we check if the objects matches both spec
        //return true if at least one of spec is true
        return spec1.isSatisfiedBy(movie) || spec2.isSatisfiedBy(movie) ;
    }
}

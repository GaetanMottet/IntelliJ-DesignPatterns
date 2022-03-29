package MyMoviesLibrary.Specifications;

import MyMoviesLibrary.Canditates.Movie;

public class AfterYearSpecification extends AbstractSpecification{

    private final int year;

    public AfterYearSpecification(int year) {
        this.year = year;
    }

    @Override
    public boolean isSatisfiedBy(Movie movie) {
        if(movie.getYear() >= year){
            return true;
        }
        return false;
    }
}

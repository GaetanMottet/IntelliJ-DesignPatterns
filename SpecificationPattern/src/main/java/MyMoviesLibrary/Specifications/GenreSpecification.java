package MyMoviesLibrary.Specifications;

import MyMoviesLibrary.Genre;
import MyMoviesLibrary.Canditates.Movie;

public class GenreSpecification extends AbstractSpecification{

    private final Genre genre;

    public GenreSpecification(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean isSatisfiedBy(Movie movie) {
        for(Genre myGenre : movie.getGenres()){
            if(myGenre == genre)
                return true;
        }

        return false;
    }
}

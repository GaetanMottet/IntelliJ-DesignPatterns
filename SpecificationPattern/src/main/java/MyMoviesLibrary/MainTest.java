package MyMoviesLibrary;
import MyMoviesLibrary.Canditates.*;
import MyMoviesLibrary.Specifications.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {


        Movie theDarkKnight = new Movie("The Dark Night", new Genre[]{Genre.Action}, 2008);
        Movie theIsland = new Movie("The Island", new Genre[]{Genre.Action, Genre.SciFi}, 2005);
        Movie uncle = new Movie("The Man From U.N.C.L.E.", new Genre[]{Genre.Action, Genre.Comedy, Genre.Drama}, 2015);
        Movie emma = new Movie("Emma.", new Genre[]{Genre.Comedy}, 2020);
        Movie avatar = new Movie("Avatar", new Genre[]{Genre.Fantastic}, 2009);
        Movie guardiansOfGalaxy1 = new Movie("Guardians of the Galaxy", new Genre[]{Genre.Action, Genre.Comedy, Genre.Fantastic}, 2014);
        Movie guardiansOfGalaxy2 = new Movie("Guardians of the Galaxy Vol. 2", new Genre[]{Genre.Action, Genre.Comedy, Genre.Fantastic}, 2017);

        List<Movie> myMovies = new ArrayList<>(Arrays.asList(theDarkKnight,theIsland,uncle,
                                    emma,avatar,guardiansOfGalaxy1,guardiansOfGalaxy2));


        //Les films d'actions qui ne sont pas des comédies (theDarkKnight, TheIsland)
        GenreSpecification action = new GenreSpecification(Genre.Action);
        GenreSpecification comedy = new GenreSpecification(Genre.Comedy);

        System.out.println("========== action but not comedy ==========");
        for(Movie m : myMovies) {
            boolean actionAndNOTcomedy = action.and(action.not(comedy)).isSatisfiedBy(m);
            System.out.println(m.getTitle() + " : " +actionAndNOTcomedy);
        }
        System.out.println();

        //Les Scifi OU Les comédies (doit retourner true pour uncle, Emma. et guardiansOfGalaxy 1 et 2)
        GenreSpecification sciFi = new GenreSpecification(Genre.SciFi);

        System.out.println("========== Scifi OR comedy ==========");
        for(Movie m : myMovies) {
            boolean sciFiORcomedy = sciFi.or(comedy).isSatisfiedBy(m);
            System.out.println(m.getTitle() + " : " +sciFiORcomedy);
        }
        System.out.println();

        //Les films d'action sorti en 2015 ou après (doit retourner true pour uncle et guardiansOfGalaxy2)
        AfterYearSpecification after2015 = new AfterYearSpecification(2015);

        System.out.println("========== Action after 2015 ==========");
        for(Movie m : myMovies) {
            boolean actionAfter2015 = action.and(after2015).isSatisfiedBy(m);
            System.out.println(m.getTitle() + " : " +actionAfter2015);
        }
        System.out.println();

        //Les films fantastiques et les comédies (doit retourner true pour guardiansOfGalaxy1 et guardiansOfGalaxy2)
        GenreSpecification fantastic = new GenreSpecification(Genre.Fantastic);

        System.out.println("========== fantastic and comedy ==========");
        for(Movie m : myMovies) {
            boolean comedyANDfantastic = comedy.and(fantastic).isSatisfiedBy(m);
            System.out.println(m.getTitle() + " : " +comedyANDfantastic);
        }
        System.out.println();

    }
}

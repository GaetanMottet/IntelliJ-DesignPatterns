package MyMoviesLibrary.Canditates;


import MyMoviesLibrary.Genre;

public class Movie {

    private String title;
    private Genre[] genres ;
    private int year ;
//    private String director;
//    private String[] starring;
//    private String[] audioLanguages;
//    private String[] subtitlesLanguages;
    public Movie(String name, Genre[] genres, int year) {
        this.title = name;
        this.genres = genres;
        this.year = year;
    }
    public Movie(String name, Genre genre, int year) {
        this.title = name;
        this.genres[0] = genre;
        this.year = year;
    }
//    public Movie(String name, Genre[] genres, int year, String director,
//                 String[] starring, String[] audioLanguages, String[] subtitlesLanguages) {
//
//        this.title = name;
//        this.genres = genres;
//        this.year = year;
//        this.director = director;
//        this.starring = starring;
//        this.audioLanguages = audioLanguages;
//        this.subtitlesLanguages = subtitlesLanguages;
//    }
    public String getTitle() {
        return title;
    }

    public Genre[] getGenres() {
        return genres;
    }

    public int getYear() {
        return year;
    }
}

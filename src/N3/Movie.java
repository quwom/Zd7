package N3;

import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public Movie(String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Movie movie = (Movie) obj;
        return Objects.equals(title, movie.title) &&
                Objects.equals(releaseYear, movie.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }
}
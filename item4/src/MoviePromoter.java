import java.util.function.Supplier;

public class MoviePromoter {

    private final Movie movie;

    public MoviePromoter(Movie movie) {
        this.movie = movie;
    }

    public MoviePromoter(Supplier<Movie> movieFactory) {
        this.movie = movieFactory.get();
    }

    public String setTitle() {
        return movie.getTitle();
    }

    public String setThumbnail() {
        return movie.getThumbnail();
    }

    public int setPosterSize() {
        return movie.getPosterSize();
    }
}

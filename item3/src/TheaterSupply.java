import java.util.function.Supplier;

public class TheaterSupply {

    public void run(Supplier<Movies> moviesSupplier) {
        Movies movies = moviesSupplier.get();
        movies.actorSpeak();
    }
}

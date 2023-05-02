import java.util.Calendar;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Movie> movieSupplier = () -> new TestMovie();
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(week);

        switch(week) {
            case 1:
                break;
            case 2:
                movieSupplier = () -> new MondayMovie();
                break;
            case 3:
                movieSupplier = () -> new TuesdayMovie();
                break;
            case 4:
                movieSupplier = () -> new WednesdayMovie();
                break;
            case 5:
                movieSupplier = () -> new ThursdayMovie();
                break;
            case 6:
                movieSupplier = () -> new FridayMovie();
                break;
            case 7:
                movieSupplier = () -> new SaturdayMovie();
                break;
        }

        MoviePromoter moviePromoter = new MoviePromoter(movieSupplier);
        //moviePromoter.setThumbnail();
        System.out.println(moviePromoter.setThumbnail());
    }
}
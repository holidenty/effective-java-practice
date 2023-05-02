
public class MondayMovie implements Movie {

    @Override
    public String getTitle() {
        return "Monday Movie Title";
    }

    @Override
    public int getColor() {
        return 1;
    }

    @Override
    public String getFont() {
        return "Monday Movie Font";
    }

    @Override
    public String getThumbnail() {
        return "Monday Movie Thumbnail";
    }

    @Override
    public String getActorsName() {
        return "Monday Movie ActorsName";
    }

    @Override
    public int getPosterSize() {
        return 10;
    }

    @Override
    public int getPosterPost() {
        return 100;
    }
}

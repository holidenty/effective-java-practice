public class FridayMovie implements Movie{

    @Override
    public String getTitle() {
        return "Friday Movie Title";
    }

    @Override
    public int getColor() {
        return 5;
    }

    @Override
    public String getFont() {
        return "Friday Movie Font";
    }

    @Override
    public String getThumbnail() {
        return "Friday Movie Thumbnail";
    }

    @Override
    public String getActorsName() {
        return "Friday Movie ActorsName";
    }

    @Override
    public int getPosterSize() {
        return 50;
    }

    @Override
    public int getPosterPost() {
        return 500;
    }
}

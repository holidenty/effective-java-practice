public class WednesdayMovie implements Movie{
    @Override
    public String getTitle() {
        return "Wednesday Movie Title";
    }

    @Override
    public int getColor() {
        return 3;
    }

    @Override
    public String getFont() {
        return "Wednesday Movie Font";
    }

    @Override
    public String getThumbnail() {
        return "Wednesday Movie Thumbnail";
    }

    @Override
    public String getActorsName() {
        return "Wednesday Movie ActorsName";
    }

    @Override
    public int getPosterSize() {
        return 30;
    }

    @Override
    public int getPosterPost() {
        return 300;
    }
}

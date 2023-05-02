public class TuesdayMovie implements Movie{
    @Override
    public String getTitle() {
        return "Tuesday Movie Title";
    }

    @Override
    public int getColor() {
        return 2;
    }

    @Override
    public String getFont() {
        return "Tuesday Movie Font";
    }

    @Override
    public String getThumbnail() {
        return "Tuesday Movie Thumbnail";
    }

    @Override
    public String getActorsName() {
        return "Tuesday Movie ActorsName";
    }

    @Override
    public int getPosterSize() {
        return 20;
    }

    @Override
    public int getPosterPost() {
        return 200;
    }
}

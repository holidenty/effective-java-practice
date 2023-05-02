public class SaturdayMovie implements Movie{

    @Override
    public String getTitle() {
        return "Saturday Movie Title";
    }

    @Override
    public int getColor() {
        return 6;
    }

    @Override
    public String getFont() {
        return "Saturday Movie Font";
    }

    @Override
    public String getThumbnail() {
        return "Saturday Movie Thumbnail";
    }

    @Override
    public String getActorsName() {
        return "Saturday Movie ActorsName";
    }

    @Override
    public int getPosterSize() {
        return 60;
    }

    @Override
    public int getPosterPost() {
        return 600;
    }
}

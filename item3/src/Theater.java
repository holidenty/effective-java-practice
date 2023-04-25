public class Theater {

    private boolean screenLight;
    private boolean soundOn;
    private boolean seatComport;

    private Movies movies;

    public Theater (Movies movies){
        this.movies = movies;
    }

    public void play() {
        screenLight = true;
        soundOn = true;
        movies.actorSpeak();
    }

    public boolean isScreenLight() { return screenLight; };
    public boolean isSoundOn() { return soundOn; };
    public boolean isSeatComport() { return seatComport; };
}

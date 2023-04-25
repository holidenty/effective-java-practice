public class TheaterTest implements Movies {
    
    //테스트 코드를 만들 수 있다

    @Override
    public void actorSpeak() {
        System.out.println("This Is Test Play!!!");
    };

    @Override
    public int getRunTime() {
        return 10;
    };

    @Override
    public String getMainActorsName() {
        return "Test";
    };

    @Override
    public int getCustomerNumber() {
        return 0;
    };

    @Override
    public String originalSountTrack() {
        return "AboutTime";
    };
}

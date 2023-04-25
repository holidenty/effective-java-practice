public class HarryPotter<T> implements Movies {

    //클라이언트 코드에서, 제네릭 타입으로 어떤 것을 넣냐에 따라 인스턴스 타입이 달라짐
    //하지만 타입이 다르더라도 인스턴스는 같음
    //장점 2. 제네릭 싱글턴 팩터리로 만들 수 있다.
    
    private static final HarryPotter<Object> INSTANCE = new HarryPotter<>();

    private HarryPotter(){};

    @SuppressWarnings("unchecked")
    public static <T> HarryPotter <T> getInstance() {
        return (HarryPotter<T>)  INSTANCE;
    }

    @Override
    public void actorSpeak() {
        System.out.println("Hi I am Actor HarryPotter");
    };

    @Override
    public int getRunTime() {
        int runTime = 480;
        return runTime;
    };

    @Override
    public String getMainActorsName() {
        String actorsName;
        actorsName = "Daniel";
        return actorsName;
    };

    @Override
    public int getCustomerNumber() {
        int customerNumber;
        customerNumber = 20000;
        return customerNumber;
    };

    @Override
    public String originalSountTrack() {
        String ost;
        ost = "harrypotterOST";
        return ost;
    };

    //역직렬화를 할 때마다 호출됨
    //오버라이딩은 아니지만 오버라이딩 처럼 동작
    //역직렬화 할 때마다 새로운 인스턴스를 반환한다는 단점을 해소
    private Object readResolve() {
        return INSTANCE;
    }
}

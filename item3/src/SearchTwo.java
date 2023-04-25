public class SearchTwo implements Movies {

    //방법 1과 단점과 해결책은 동일함 (리플렉션, 역직렬화)

    //인스턴스를 private으로 선언한다는게 특징
    private static final SearchTwo INSTANCE = new SearchTwo();
    private SearchTwo(){};

    //정적 팩토리 메서드로 인스턴스를 반환
    //클라이언트 코드 변경 없이 이 부분의 변경만으로 동작을 변경 가능
    //장점 1. 클라이언트 코드의 영향이 줄어듬
    public static SearchTwo getInstance() {return INSTANCE;};

    @Override
    public void actorSpeak() {
        System.out.println("Hi I am Actor SearchTwo");
    };

    @Override
    public int getRunTime() {
        int runTime = 160;
        return runTime;
    };

    @Override
    public String getMainActorsName() {
        String actorsName;
        actorsName = "SearchTwo";
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
        ost = "searchTwoOST";
        return ost;
    };

    //역직렬화를 할 때마다 호출됨
    //오버라이딩은 아니지만 오버라이딩 처럼 동작
    //역직렬화 할 때마다 새로운 인스턴스를 반환한다는 단점을 해소
    private Object readResolve() {
        return INSTANCE;
    }
}

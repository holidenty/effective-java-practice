public enum SlamDunk implements Movies {

    INSTANCE;
    
    // 리플렉션에 대해 안전함, 내부 코드적으로 생성자 접근 자체가 불가능함
    // 역직렬화에 대해서도 안점함. readResolve 선언도 필요 없음
    // 테스트 비용에 대해서도 implements가 가능하게 때문에 ㄱㅊㄱㅊ
    
    @Override
    public void actorSpeak() {
        System.out.println("Hi I am Actor KangBaekHo");
    };

    @Override
    public int getRunTime() {
        int runTime = 90;
        return runTime;
    };

    @Override
    public String getMainActorsName() {
        String actorsName;
        actorsName = "KangBaekHo";
        return actorsName;
    };

    @Override
    public int getCustomerNumber() {
        int customerNumber;
        customerNumber = 12302;
        return customerNumber;
    };

    @Override
    public String originalSountTrack() {
        String ost;
        ost = "너에게로 가는 길";
        return ost;
    };

    //역직렬화를 할 때마다 호출됨
    //오버라이딩은 아니지만 오버라이딩 처럼 동작
    //역직렬화 할 때마다 새로운 인스턴스를 반환한다는 단점을 해소
    private Object readResolve() {
        return INSTANCE;
    }
}

import java.io.Serializable;

public class DoorDanSok implements Movies, Serializable {

    //싱글턴 방법 1. Public 으로 만든 인스턴스
    //단점1. 테스트가 어려움 (영화가 잘 상영되는지 보려면 매번 상영을 해서 확인을 해야한다?)
    //단점2. 역직렬화 할 때마다 다른 인스턴스가 생겨남

    //최초에 인스턴스 생성할 때 리플렉션 방지 플래그가 true가 되어 더이상 호출 불가
    public static final DoorDanSok INSTANCE = new DoorDanSok();

    //리플렉션 방지 플래그
    private static boolean created;

    //일부러 생성자는 private으로 만들어 외부에서 호출 불가
    //만들어진것만 가져다 쓰라는 의미
    private DoorDanSok() {
        if (created)
            throw new UnsupportedOperationException("This Movies is Already Existed!");
        created = true;
    }

    @Override
    public void actorSpeak() {
        System.out.println("Hi I am Actor Szumae");
    };

    @Override
    public int getRunTime() {
        int runTime = 240;
        return runTime;
    };

    @Override
    public String getMainActorsName() {
        String actorsName;
        actorsName = "Szumae";
        return actorsName;
    };

    @Override
    public int getCustomerNumber() {
        int customerNumber;
        customerNumber = 10000;
        return customerNumber;
    };

    @Override
    public String originalSountTrack() {
        String ost;
        ost = "szumaeOST";
        return ost;
    };

    //역직렬화를 할 때마다 호출됨
    //오버라이딩은 아니지만 오버라이딩 처럼 동작
    //역직렬화 할 때마다 새로운 인스턴스를 반환한다는 단점을 해소
    private Object readResolve() {
        return INSTANCE;
    }

}

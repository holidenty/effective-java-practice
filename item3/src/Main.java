import com.sun.media.sound.ModelOscillator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

//        Theater theater = new Theater(DoorDanSok.INSTANCE);
//        theater.play();
//        System.out.println("Hello world!");
//
//        try {
//            Constructor<DoorDanSok> defaultConstructor = DoorDanSok.class.getDeclaredConstructor();
//            defaultConstructor.setAccessible(true);
//        }
//        catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e){
//            e.printStackTrace();
//        }

        //정적 팩토리의 메서드 참조를 공급자 (Supplier)로 사용할 수 있다.
        TheaterSupply theaterSupply = new TheaterSupply();
        theaterSupply.run(() -> SearchTwo.getInstance());

    }
}
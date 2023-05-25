package practice_5;

public class Singleton_3 {
    private static Singleton_3 INSTANCE;

    private Singleton_3() {
    }

    public static synchronized Singleton_3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton_3();
        }
        return INSTANCE;
    }
}

//Плюсы:
//        Ленивая инициализация.
//
//        Потокобезопасность
//
//        Минусы:
//        Низкая производительность в многопоточной среде
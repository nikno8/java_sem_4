package practice_5;

public class Singleton_4 {
    private static Singleton_4 INSTANCE;

    private Singleton_4() {
    }

    public static Singleton_4 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton_4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton_4();
                }
            }
        }
        return INSTANCE;
    }
}
//Плюсы:
//        Ленивая инициализация.
//
//        Потокобезопасность
//
//        Высокая производительность в многопоточной среде
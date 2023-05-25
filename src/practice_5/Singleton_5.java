package practice_5;

public class Singleton_5 {

    private Singleton_5() {
    }

    private static class SingletonHolder {
        public static final Singleton_5 HOLDER_INSTANCE = new Singleton_5();
    }

    public static Singleton_5 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}

//Плюсы:
//        Ленивая инициализация.
//
//        Потокобезопасность.
//
//        Высокая производительность в многопоточной среде.
//
//        Минусы:
//        Для корректной работы необходима гарантия, что объект класса Singleton инициализируется без ошибок.
//        Иначе первый вызов метода getInstance закончится ошибкой ExceptionInInitializerError,
//        а все последующие NoClassDefFoundError.
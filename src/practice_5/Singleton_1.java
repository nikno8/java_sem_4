package practice_5;

public class Singleton_1 {
        private static final Singleton_1 INSTANCE = new Singleton_1();

        private Singleton_1() {
        }

        public static Singleton_1 getInstance() {
            return INSTANCE;
        }
}

//    Самая простая реализация.
//
//        Плюсы:
//        Простота и прозрачность кода
//
//        Потокобезопасность
//
//        Высокая производительность в многопоточной среде
//
//        Минусы:
//        Не ленивая инициализация.(класс загружается при старте приложения)
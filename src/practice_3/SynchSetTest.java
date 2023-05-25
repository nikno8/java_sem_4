package practice_3;

import java.util.Set;

public class SynchSetTest {
    private static Set<Integer> mySet = new SynchSet<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                mySet.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 10; i < 21; i++) {
                mySet.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Synchronized:");
        mySet.forEach((item)-> System.out.println(item));
    }
}


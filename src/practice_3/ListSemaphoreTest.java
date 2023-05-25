package practice_3;


import java.util.List;

public class ListSemaphoreTest {
    private static List<Integer> listSync = new ListSemaphore<>();


    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                listSync.add(i);
            }
            System.out.println("5th element: " + listSync.get(5));
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 10; i < 25; i++) {
                listSync.add(i);
            }
            listSync.remove(8);
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sync list:");
        listSync.forEach(System.out::println);
    }

}



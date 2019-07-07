import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class MainClass {
    static Object car1;
    static Object race1;
    public static final int CARS_COUNT = 4;
    static CyclicBarrier cb = new CyclicBarrier(CARS_COUNT);
    static final CountDownLatch cdl = new CountDownLatch(CARS_COUNT);
    private static Object rase1;
    static Road road = new Road(60);

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Race race1 = new Race(road);
        for (int j = 0; j < CARS_COUNT; j++) {
            final int w = j;
            new Thread(() -> {
                try {
                    System.out.println("участник" + (w + 1) + " готовится");
                    Thread.sleep(500 + (int) (Math.random() * 800));
                    cb.await();
                    System.out.println("участник" + (w + 1) + " готов");
                    cdl.countDown();
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }).start();
        }

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Car[] cars = new Car[CARS_COUNT];
//        for (int i = 0; i < cars.length; i++) {
//            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
//        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        new Thread(() -> {
            Car car1 = new Car(race1, 20 + (int) (Math.random() * 10));
            System.out.println("Участник1" + car1.getCar() + road.getLength() + " метров");
        }).start();

        new Thread(() -> {
            Car car2 = new Car(race1, 20 + (int) (Math.random() * 10));
            System.out.println("Участник2" + car2.getCar() + road.getLength() + " метров");
        }).start();

        new Thread(() -> {
            Car car3 = new Car(race1, 20 + (int) (Math.random() * 10));
            System.out.println("Участник3" + car3.getCar() + road.getLength() + " метров");
        }).start();

        new Thread(() -> {
            Car car4 = new Car(race1, 20 + (int) (Math.random() * 10));
            System.out.println("Участник4" + car4.getCar() + road.getLength() + " метров");
        }).start();

        new Thread(() -> {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        }).start();

    }

}

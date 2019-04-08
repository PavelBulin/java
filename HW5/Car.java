import java.util.concurrent.CyclicBarrier;

public class Car {
    private static int CARS_COUNT;

    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Object getCar() {
        return " начал этап: Дорога ";
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
    }

}
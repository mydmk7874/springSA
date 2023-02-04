import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus(189);

        bus1.increasePassenger(2);

        bus1.decreaseFuel(50);

        bus1.changeStatus();

        bus1.increaseFuel(10);

        bus1.viewStatus();

        bus1.changeStatus();

        bus1.increasePassenger(45);

        bus1.increasePassenger(5);

        bus1.decreaseFuel(55);
    }
}


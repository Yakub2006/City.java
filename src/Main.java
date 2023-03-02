import by.my.city.City;
import by.my.transport.ground.Bus;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(80, 5, 40, 0.5);
        City city = new City("Minsk", true, false, 53, 53);

        System.out.println(bus);
        System.out.println(city);

    }
}
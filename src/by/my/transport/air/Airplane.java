package by.my.transport.air;

import by.my.transport.air.Air;

public class Airplane extends Air {
    public Airplane(double speed,
                    double loadCapacity,
                    int passengers,
                    double priceByKm) {
        super(speed, loadCapacity, passengers, priceByKm);
    }
}

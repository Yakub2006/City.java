package by.my.transport.ground;

import by.my.transport.ground.Ground;

public class Track extends Ground {
    public Track(double speed,
                 double loadCapacity,
                 int passengers,
                 double priceByKm) {
        super(speed, loadCapacity, passengers, priceByKm);
    }
}

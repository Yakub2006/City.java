package by.my.transport.ground;

import by.my.transport.Transport;

public class Ground extends Transport {
    public Ground(double speed,
                  double loadCapacity,
                  int passengers,
                  double priceByKm) {
        super(speed, loadCapacity, passengers, priceByKm);
    }
}

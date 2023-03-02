package by.my.transport.air;

import by.my.transport.Transport;

public class Air extends Transport {
    public Air(double speed,
               double loadCapacity,
               int passengers,
               double priceByKm) {
        super(speed, loadCapacity, passengers, priceByKm);
    }
}

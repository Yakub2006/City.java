public class Transport {
    private double speed;
    private double loadCapacity;
    private int passengers;
    private double priceByKm;

    public Transport(double speed,
                     double loadCapacity,
                     int passengers,
                     double priceByKm) {
        this.speed = speed;
        this.loadCapacity = loadCapacity;
        this.passengers = passengers;
        this.priceByKm = priceByKm;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getPriceByKm() {
        return priceByKm;
    }

    public void setPriceByKm(double priceByKm) {
        this.priceByKm = priceByKm;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "speed=" + speed +
                ", loadCapacity=" + loadCapacity +
                ", passengers=" + passengers +
                ", priceByKm=" + priceByKm +
                '}';
    }
}

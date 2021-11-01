public class Truck extends Transport {
    TransportFactory transportFactory;

    public Truck(TransportFactory transportFactory){
        this.transportFactory = transportFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + transportName);
        loadCapacity = transportFactory.createLoadCapacity();
        cargoShips = transportFactory.createCargoShips();
    }
}

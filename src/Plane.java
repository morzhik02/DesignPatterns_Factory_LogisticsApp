public class Plane extends Transport {
    TransportFactory transportFactory;
    public Plane(TransportFactory transportFactory){
        this.transportFactory = transportFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + transportName);
        loadCapacity = transportFactory.createLoadCapacity();
        cargoShips = transportFactory.createCargoShips();
    }
}

public class Ships extends Transport {
    TransportFactory transportFactory;
    public Ships(TransportFactory transportFactory){
        this.transportFactory = transportFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + transportName);
        loadCapacity = transportFactory.createLoadCapacity();
        cargoShips = transportFactory.createCargoShips();
    }
}

public abstract class Transport {
    String transportName;
    CargoShips cargoShips;
    LoadCapacity loadCapacity;

    abstract void prepare();

    void buildRoute(){
        System.out.println("The route is being built now...");
    }
    void sendInformation(){
        System.out.println("They receive route data, contact details and comments on the order...");
    }

    void depart(){
        System.out.println("Transport on the way...");
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

}

public class AlmatyCompanyTransportFactory implements TransportFactory {

    @Override
    public LoadCapacity createLoadCapacity() {
        return new LoadCapacityUpTo10Tons();
    }

    @Override
    public CargoShips createCargoShips() {
        return new ContainerShips();
    }
}

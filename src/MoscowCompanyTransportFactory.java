public class MoscowCompanyTransportFactory implements TransportFactory {
    @Override
    public LoadCapacity createLoadCapacity() {
        return new LoadCapacityUpTo20Tons();
    }

    @Override
    public CargoShips createCargoShips() {
        return new BulkShips();
    }
}

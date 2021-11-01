public abstract class Logistics {

    protected abstract Transport createTransport(String type);

    public Transport orderTransport(String type){
        Transport transport = createTransport(type);

        transport.prepare();
        transport.buildRoute();
        transport.sendInformation();
        transport.depart();

        return transport;
    }
}

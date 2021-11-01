public class AlmatyCompanyLogistics extends Logistics{

    @Override
    protected Transport createTransport(String item) {
        Transport transport = null;
        TransportFactory transportFactory = new AlmatyCompanyTransportFactory();

        if (item.equals("truck")){
            transport = new Truck(transportFactory);
            transport.setTransportName("Truck of the Almaty Logistics Company");
        } else if (item.equals("ships")){
            transport = new Ships(transportFactory);
            transport.setTransportName("Ships of the Almaty Logistics Company");
        } else if (item.equals("plane")){
            transport = new Plane(transportFactory);
            transport.setTransportName("Plane of the Almaty Logistics Company");
        }
        return transport;
    }
}

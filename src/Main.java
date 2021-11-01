public class Main {
    public static void main(String[] args) {
        Logistics almatyCompany = new AlmatyCompanyLogistics();
        Logistics moscowCompany = new MoscowCompanyLogistics();

        almatyCompany.orderTransport("ships");
        System.out.println();

        almatyCompany.orderTransport("truck");
        System.out.println();

        moscowCompany.orderTransport("plane");

    }
}

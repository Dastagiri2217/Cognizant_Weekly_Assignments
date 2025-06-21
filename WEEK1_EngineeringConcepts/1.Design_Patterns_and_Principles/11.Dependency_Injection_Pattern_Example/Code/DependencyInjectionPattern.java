public class DependencyInjectionPattern {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject dependency into service
        CustomerService service = new CustomerService(repository);

        // Use service
        System.out.println("Fetching 3233:");
        service.displayCustomer("3233");

        System.out.println("\nFetching 3240:");
        service.displayCustomer("3240");
    }
}

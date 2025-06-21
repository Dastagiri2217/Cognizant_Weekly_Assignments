import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerData = new HashMap<>();

    public CustomerRepositoryImpl() {
        customerData.put("3233", new Customer("C101", "Dastagiri"));
        customerData.put("3239", new Customer("C102", "Chatrapathi"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerData.get(id);
    }
}
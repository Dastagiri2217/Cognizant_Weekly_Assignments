public class EmployeeSystemTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        Employee e1 = new Employee(101, "Dastagiri", "Manager", 75000);
        Employee e2 = new Employee(102, "Chatrapathi", "Developer", 55000);
        Employee e3 = new Employee(103, "Nithin", "Designer", 50000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        System.out.println("\nAll Employees:");
        manager.listEmployees();

        System.out.println("\nSearching for Employee with ID 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Employee not found");

        System.out.println("\nDeleting Employee with ID 102:");
        manager.deleteEmployee(102);

        System.out.println("\nEmployees after deletion:");
        manager.listEmployees();
    }
}

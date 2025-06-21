public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee e) {
        if (size >= employees.length) {
            System.out.println("Cannot add employee. Array is full.");
            return;
        }
        employees[size++] = e;
        System.out.println("Added: " + e.getName());
    }

    // Search employee by ID
    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse all employees
    public void listEmployees() {
        if (size == 0) {
            System.out.println("No employees to display.");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public void deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                //Shifting to Fill Gap
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Employee ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Employee ID " + id + " not found.");
    }
}

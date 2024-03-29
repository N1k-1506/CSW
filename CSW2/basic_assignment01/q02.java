package basic_assignment01;
class Employee {
    private String employeeId;
    private String name;
    private double salary;
    // Setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Getters
    public String getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
    // Override toString method
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Salary: $" + salary;
    }
}
public class q02 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee();
        employee.setEmployeeId("E001");
        employee.setName("John Doe");
        employee.setSalary(50000.0);
        // Display initial details
        System.out.println("Initial Employee Details:");
        employee.displayDetails();
        // Update employee details
        employee.setEmployeeId("E002");
        employee.setName("Jane Smith");
        employee.setSalary(60000.0);
        // Display updated details
        System.out.println("\nUpdated Employee Details:");
        System.out.println(employee);
    }
}


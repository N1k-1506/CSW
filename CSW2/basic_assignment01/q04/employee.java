package basic_assignment01.q04;
class Employee {
    private String employeeId;
    private String name;
    private double salary;
    public Employee(String empID,String Name,double sal){
        employeeId=empID;
        name=Name;
        salary=sal;
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
public class employee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("E001","John Doe",50000.0);
        // Display initial details
        System.out.println("Initial Employee Details:");
        employee.displayDetails();
    }
}
public class EmployeeInfo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Hemz", 26, 11914381, 50000.0);

        // Display info about the employee
        System.out.println("Employee Information:");
        employee.displayEmployeeInfo();
    }
}
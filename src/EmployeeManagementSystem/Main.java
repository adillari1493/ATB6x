package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex Ansbro", 10000);
        Manager manager = new Manager("Sujata", 12000, "TDM");

        employee.displayEmployeeDetails();
        manager.displayManagerDetails();
    }
}

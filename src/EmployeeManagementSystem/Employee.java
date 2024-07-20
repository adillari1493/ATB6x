package EmployeeManagementSystem;

public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    protected void displayEmployeeDetails()
    {
        System.out.println("Employee name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
}

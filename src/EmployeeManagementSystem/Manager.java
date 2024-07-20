package EmployeeManagementSystem;

public class Manager extends Employee{
    private String department;

  public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void displayManagerDetails()
    {
        displayEmployeeDetails();
        System.out.println("Manager Department: "+department);
    }

}

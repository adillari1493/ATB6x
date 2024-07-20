package EmployeeManagementSystemExternal;

import EmployeeManagementSystem.Employee;

public class ExternalEmployee extends Employee {

    public ExternalEmployee(String name, int salary) {
        super(name, salary);
    }

    void showDetails()
    {
        displayEmployeeDetails();
    }
}


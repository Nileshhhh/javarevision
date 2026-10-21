package javarevision.EmployeePayroll;

public abstract class Employee {

    private String name;

    Employee(String name)
    {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void printSalary()
    {
        System.out.println(name + " earns " + calculateSalary());
    }
}

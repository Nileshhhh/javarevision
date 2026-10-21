package javarevision.EmployeePayroll;

public class PartTimeEmployee extends Employee{

    private int hoursWorked; private double hourlyRate;
    PartTimeEmployee(String name, int hoursWorked, double hourlyRate)
    {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary()
    {
        return hoursWorked * hourlyRate;
    }
}

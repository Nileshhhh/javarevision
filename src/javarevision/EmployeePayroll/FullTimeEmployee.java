package javarevision.EmployeePayroll;

public class FullTimeEmployee extends Employee{

    private double baseSalary, bonus;

    FullTimeEmployee(String name, double baseSalary, double bonus)
    {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary()
    {
        return baseSalary + bonus;
    }
}

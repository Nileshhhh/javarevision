package javarevision.EmployeePayroll;

public class Main {
    public static void main(String[] args) {
        double total =0;
        Employee[] employees = new Employee[4];
        employees[0] = new FullTimeEmployee("Amit", 30000, 5000);
        employees[1] = new FullTimeEmployee("Neha", 40000, 8000);
        employees[2] = new PartTimeEmployee("Ravi", 80, 250);
        employees[3] = new Intern("Kiran", 10000);
        for (Employee e : employees) {
            e.printSalary();
            total = total + e.calculateSalary();
        }

        System.out.println("Total payroll: " + total );
    }
}

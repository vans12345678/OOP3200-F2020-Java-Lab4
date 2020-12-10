package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    //private date members
    private double yearlySalary;

    //Constructors
    SalariedEmployee(String fullName, LocalDate birthDate, final String employeeID, double yearlySalary)
    {
        super(fullName, birthDate, employeeID);
        setYearlySalary(yearlySalary);
    }

    //Mutators
    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary)
    {
        if(yearlySalary > 0.0)
        {
            this.yearlySalary = yearlySalary;
        }
        else
        {
            throw new IllegalArgumentException("Yearly Salary must be a non-negative number.");
        }

    }

    //Methods
    @Override
    public double calculatePayDay()
    {
        final int WEEKS = 52;

        double weeklyPay = yearlySalary / WEEKS;
        return Math.round(weeklyPay * 100) / 100;
    }

    public void Display()
    {
        System.out.println("Name: " + getName());
        System.out.println("Date: " + getBirthDate());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Yearly Salary: $" + getYearlySalary());
        System.out.printf("Calculated Pay: $%1.2f",calculatePayDay());
    }
}

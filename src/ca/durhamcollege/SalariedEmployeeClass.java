package ca.durhamcollege;

import java.time.LocalDate;

public class SalariedEmployeeClass extends Employee
{
    private double yearlySalary;

    SalariedEmployeeClass(String fullName, LocalDate birthDate, final String employeeID, double yearlySalary)
    {
        super(fullName, birthDate, employeeID);
        setYearlySalary(yearlySalary);
    }
    //Mutators
    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    //Methods

    @Override
    public double calculatePayDay(double yearlySalary, double hours)
    {
        final int WEEKS = 52;

        double weeklyPay = yearlySalary / WEEKS;
        return Math.round(weeklyPay * 100) / 100;
    }
}

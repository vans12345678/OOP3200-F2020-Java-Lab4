package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
    //Private data members
    private double hourlyRate;
    private double hoursPerWeek;

    //Constructors
    HourlyWorker(String fullName, LocalDate birthDate, final String employeeID,double hourlyRate, double hoursPerWeek)
    {
        super(fullName, birthDate, employeeID);
        setHourlyRate(hourlyRate);
        setHoursPerWeek(hoursPerWeek);
    }

    //Mutators
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate >= 17.00)
        {
            this.hourlyRate = hourlyRate;
        }
        else
        {
            throw new IllegalArgumentException("Hourly Rate must be a greater or equal to $17.00");
        }
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        if(hoursPerWeek <= 48.0 && hoursPerWeek >= 0)
        {
            this.hoursPerWeek = hoursPerWeek;
        }
        else
        {
            throw new IllegalArgumentException("Hours Per Week must be less than or equal to 48.0 and greater than"+
                                                "or equal to 0.0");
        }
    }

    //Methods
    @Override
    public double calculatePayDay()
    {
        double earned = (hoursPerWeek * hourlyRate);
        return Math.round(earned * 100) / 100;
    }
    public void Display()
    {
        System.out.println("Name: " + getName());
        System.out.println("Date: " + getBirthDate());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.printf("Hourly Rate: $%1.2f$", getHourlyRate());
        System.out.println("\nHours Per Week: " + getHoursPerWeek());
        System.out.printf("Calculated Pay: $%1.2f",calculatePayDay());
    }
}

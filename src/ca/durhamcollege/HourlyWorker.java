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
    public double getHoursPerWeek() {
    return hoursPerWeek;
}
    public void setHoursPerWeek(double hoursPerWeek)
    {
        //If hours is within range, set hoursPerWeek
        if(hoursPerWeek <= 48.0 && hoursPerWeek >= 0)
        {
            this.hoursPerWeek = hoursPerWeek;
        }
        //Otherwise throw exception and do not set hoursPerWeek
        else
        {
            throw new IllegalArgumentException("Hours Per Week must be less than or equal to 48.0 and greater than"+
                    "or equal to 0.0");
        }
    }
    public void setHourlyRate(double hourlyRate)
    {
        //If hourly rate is greater than min. set hourlyRate
        if(hourlyRate >= 17.00)
        {
            this.hourlyRate = hourlyRate;
        }
        //Otherwise throw exception and do not set hourlyRate
        else
        {
            throw new IllegalArgumentException("Hourly Rate must be a greater or equal to $17.00");
        }
    }


    //Methods
    @Override
    public double calculatePayDay()
    {
        double earned = (hoursPerWeek * hourlyRate);
        return (earned * 100) / 100;
    }

    //To display Salaried Employee data members
    public void Display()
    {
        System.out.println("Name: " + getName());
        System.out.println("Date: " + getBirthDate());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.printf("Hourly Rate: $%1.2f", getHourlyRate());
        System.out.println("\nHours Per Week: " + getHoursPerWeek());
        System.out.printf("Calculated Pay: $%1.2f",calculatePayDay());
    }
}

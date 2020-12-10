package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
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
        this.hourlyRate = hourlyRate;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    //Methods

    @Override
    public double calculatePayDay(double hoursPerWeek, double hourlyRate)
    {
        double earned = (hoursPerWeek * hourlyRate);
        return Math.round(earned * 100) / 100;
    }
}

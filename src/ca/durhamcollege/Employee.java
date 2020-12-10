package ca.durhamcollege;
import java.time.LocalDate;

public abstract class Employee extends Person
{
    private String employeeID;

    Employee(String fullName, LocalDate birthDate, final String employeeID)
    {
        super(fullName, birthDate);
        this.employeeID = employeeID;
    }
    //accessors

    public String getEmployeeID() {
        return employeeID;
    }

    public double calculatePayDay(double pay, double hours)
    {
        return pay;
    }
}

package ca.durhamcollege;
import java.time.LocalDate;
import java.util.regex.Pattern;

public abstract class Employee extends Person
{
    //Private data members
    private String employeeID;

    //Constructors
    Employee(String fullName, LocalDate birthDate, final String employeeID)
    {
        super(fullName, birthDate);

        if(Pattern.matches("[0-9]+",employeeID) == true && employeeID.length()==8)
        {
            this.employeeID = employeeID;
        }
        else
        {
            throw new IllegalArgumentException("Employee ID must be exactly 8 numbers.");
        }
    }

    //accessors

    public String getEmployeeID()
    {
        return employeeID;
    }

    public double calculatePayDay()
    {
        double totalPay = 0.0;

        return Math.round(totalPay * 100) / 100;
    }
}

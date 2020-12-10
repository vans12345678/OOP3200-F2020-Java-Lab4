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

        //If employee is string containing only numbers and is of length 8, set employeeID
        if(Pattern.matches("[0-9]+",employeeID) == true && employeeID.length()==8)
        {
            this.employeeID = employeeID;
        }
        //Otherwise, throw exception and do not set employeeID
        else
        {
            throw new IllegalArgumentException("Employee ID must be exactly 8 numbers.");
        }
    }

    //Mutators
    public String getEmployeeID()
    {
        return employeeID;
    }

    //Methods
    public double calculatePayDay()
    {
        double totalPay = 0.0;

        return (totalPay * 100) / 100;
    }
}

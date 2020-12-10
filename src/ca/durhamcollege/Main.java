/**
 * Course: OOP 3200
 * Group 3: Andre Agrippa, Najeebulla Hussaini
 * Date: 12/09/2020
 * Purpose: To demonstrate the SalariedEmployee and HourlyWorker class from base abstract class Employee
 */
package ca.durhamcollege;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args)
    {

        //Create objects of salaried employee and hourly worker
        SalariedEmployee salariedEmployee;
        HourlyWorker hourlyEmployee;

        //Create LocalDate format
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //Parse Date through LocalDate formatter
        LocalDate salariedDate = LocalDate.parse("1999-02-23", dateFormat);
        LocalDate hourlyDate = LocalDate.parse("1999-03-23", dateFormat);

        //Initialize objects of salaried employee and hourly worker
        salariedEmployee = new SalariedEmployee("Andre Agrippa", salariedDate, "12345678", 500000 );
        hourlyEmployee = new HourlyWorker("Bob Smith", hourlyDate, "87654321", 17.00, 2);

        //Display data members of Salaried Employee
        System.out.println("Salaried Employee");
        System.out.println("----------------------------");
        salariedEmployee.Display();

        System.out.println();
        System.out.println("----------------------------");

        //Changed yearly salary amount of Salaried Employee
        salariedEmployee.setYearlySalary(100000);
        System.out.println("Changed Yearly Salary Salaried Employee");
        System.out.println("----------------------------");
        salariedEmployee.Display();

        System.out.println();
        System.out.println("----------------------------");

        //Display data members of Hourly Worker
        System.out.println("Hourly Worker");
        System.out.println("----------------------------");
        hourlyEmployee.Display();

        System.out.println();
        System.out.println("----------------------------");

        //Change hourly rate and hours per week
        hourlyEmployee.setHourlyRate(18.00);
        hourlyEmployee.setHoursPerWeek(4);

        //Display new hourly worker
        System.out.println("Changed Hourly Worker");
        System.out.println("----------------------------");
        hourlyEmployee.Display();

        System.out.println();
        System.out.println("----------------------------");

        try
        {
            LocalDate salariedDate0 = LocalDate.parse("1999-01-01", dateFormat);
            SalariedEmployee salariedEmployee0 = new SalariedEmployee("NameOne", salariedDate, "12345678", 500000 );

            LocalDate salariedDate1 = LocalDate.parse("1999-01-02", dateFormat);
            SalariedEmployee salariedEmployee1= new SalariedEmployee("NameTwo", salariedDate, "12345678", 500000 );

            LocalDate hourlyDate0 = LocalDate.parse("1999-02-01", dateFormat);
            HourlyWorker hourlyEmployee0 = new HourlyWorker("NameThree", hourlyDate, "87654321", 17.00,2);


            Employee[] empArr = new Employee[3];
            empArr[0] = salariedEmployee0;
            empArr[1] = salariedEmployee1;
            empArr[2] = hourlyEmployee0;

            double totalAmountPaid = 0;
            for (int i = 0; i < empArr.length; i++)
            {
                System.out.println("----------------------------");
                System.out.println("Employee ID: " + empArr[i].getEmployeeID());
                System.out.println("Employee Name: " + empArr[i].getName());
                System.out.println("Calculate Pay Day: " + empArr[i].calculatePayDay());

                totalAmountPaid += empArr[i].calculatePayDay();

            }
            System.out.println("TOTAL AMOUNT PAID: " + totalAmountPaid);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }



    }
}

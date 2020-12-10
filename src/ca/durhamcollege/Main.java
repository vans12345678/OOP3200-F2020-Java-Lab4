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
        salariedEmployee = new SalariedEmployee("Andre Agrippa", salariedDate, "12345678", 500000.25);
        hourlyEmployee = new HourlyWorker("Bob Smith", hourlyDate, "87654321", 17.00, 10);

        //Display data members of Salaried Employee
        System.out.println("--------------------------------------------");
        System.out.println("Salaried Employee");
        System.out.println("--------------------------------------------");
        salariedEmployee.Display();

        System.out.println();
        System.out.println("--------------------------------------------");

        //Changed yearly salary amount of Salaried Employee
        salariedEmployee.setYearlySalary(100000.12);
        System.out.println("Changed Yearly Salary Salaried Employee");
        System.out.println("--------------------------------------------");
        salariedEmployee.Display();

        System.out.println();
        System.out.println("--------------------------------------------");

        //Display data members of Hourly Worker
        System.out.println("Hourly Worker");
        System.out.println("--------------------------------------------");
        hourlyEmployee.Display();

        System.out.println();
        System.out.println("--------------------------------------------");

        //Change hourly rate and hours per week
        hourlyEmployee.setHourlyRate(18.00);
        hourlyEmployee.setHoursPerWeek(4);

        //Display new hourly worker
        System.out.println("Changed Hourly Worker");
        System.out.println("--------------------------------------------");
        hourlyEmployee.Display();

        System.out.println();
        System.out.println("-----------------------------------------------------");

        try
        {
            LocalDate salariedDate0 = LocalDate.parse("1999-01-01", dateFormat);
            SalariedEmployee salariedEmployee0 = new SalariedEmployee("NameOne", salariedDate, "12345678", 500000);

            LocalDate salariedDate1 = LocalDate.parse("1999-01-02", dateFormat);
            SalariedEmployee salariedEmployee1= new SalariedEmployee("NameTwo", salariedDate, "12342478", 56000 );

            LocalDate hourlyDate0 = LocalDate.parse("1999-02-01", dateFormat);
            HourlyWorker hourlyEmployee0 = new HourlyWorker("NameThree", hourlyDate, "47383456", 17.50,2);

            LocalDate hourlyDate1 = LocalDate.parse("2012-02-02", dateFormat);
            HourlyWorker hourlyEmployee1 = new HourlyWorker("NameFour", hourlyDate, "09234576", 25.25,9);

            LocalDate hourlyDate2 = LocalDate.parse("2020-02-25", dateFormat);
            HourlyWorker hourlyEmployee2 = new HourlyWorker("NameFive", hourlyDate, "84327856", 50.25,4);

            //Make employee Array, place hourly and salaried employees
            Employee[] empArr = new Employee[5];
            empArr[0] = salariedEmployee0;
            empArr[1] = salariedEmployee1;
            empArr[2] = hourlyEmployee0;
            empArr[3] = hourlyEmployee1;
            empArr[4] = hourlyEmployee2;


            double totalAmountPaid = 0;


            System.out.print("Employee ID\t Employee Name\t Calculate Pay Day" +"\n");
            System.out.println("-----------------------------------------------------");

            for (int i = 0; i < empArr.length; i++)
            {
                System.out.print(empArr[i].getEmployeeID() + "\t " + empArr[i].getName() + "\t\t $");
                System.out.printf("%1.2f",empArr[i].calculatePayDay());
                System.out.println();

                totalAmountPaid += empArr[i].calculatePayDay();

            }
            System.out.println("-----------------------------------------------------");
            System.out.printf("TOTAL AMOUNT PAID: $%1.2f", totalAmountPaid);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

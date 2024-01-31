/*
Name:   Gil
Date:   January 25, 2024
Lab 3 Payroll Calculator
*/

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args)
    {
        String  employeeName;
        char    employeeType;
        double  employeeSalary,
                employeeHours,
                employeeCheckAmount;
        
        try (Scanner keyboard = new Scanner(System.in)) 
        {
            System.out.print("\nEnter employee name: ");
            employeeName = keyboard.nextLine();
            System.out.print("Enter employee type. Enter H for HOURLY and S for SALARY: ");
            employeeType = keyboard.next().charAt(0);

            if (employeeType == 's' || employeeType == 'S')
            {
                System.out.print("Enter employee yearly salary: $");
                employeeSalary = keyboard.nextDouble();
                employeeCheckAmount = employeeSalary / 52;
            }
            else
            {
                System.out.print("Enter employee hours worked: ");
                employeeHours = keyboard.nextDouble(); 
                
                if (employeeHours < 40)
                    employeeCheckAmount = employeeHours * 25;
                else
                    employeeCheckAmount = (40 * 25) + ((employeeHours - 40) * (25 * 1.25));
            }
                
        System.out.printf("\n%-20s %s%n", "Employee Name:", employeeName);
        System.out.printf("%-20s %c%n", "Employee Type:", employeeType);
        System.out.printf("%-20s $%,10.2f%n", "Pay Total:", employeeCheckAmount);

        }
    }
}
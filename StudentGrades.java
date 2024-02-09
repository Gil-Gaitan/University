/*
Name:   Gil
Date:   February 8th, 2024
Lab 3 Payroll Calculator
import java.util.Scanner;
*/
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args)
    {
        Scanner buf = new Scanner(System.in);
        int num, i;
        String name, response;
        int age;
        float gpa;
        
       //System.out.printf("How many students?: ");
        //num = buf.nextInt;
        //buf.nextLine(); //Read Enter Key
        //i = 0;

        do
        {
            System.out.printf("Enter student name: ");
            name = buf.nextLine(); //Read Enter Key
            
            System.out.printf("Enter student age: ");
            name = buf.nextLine();

            System.out.printf("Enter student GPA: ");
           gpa = buf.nextFloat();

            System.err.printf("%15s %10d %12.2f\n", name, age, gpa);

            System.out.printf("Done? ");
            response = buf.nextLine;
            i++;

        }while (!response.equalsIgnoreCase("Done"));
    }
}
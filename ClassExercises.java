/*
Name:   Gil
Date:   January 25, 2024
Lab 3 Payroll Calculator
import java.util.Scanner;
*/
import java.util.Scanner;

public class ClassExercises {
    public static void main(String[] args)
    {
        int start = 1;
        int ender = 12;
        int userNumber;

        Scanner buffer = new Scanner (System.in);

        

        System.err.println("Enter your numbber: ");
            userNumber = keyboard.nextInt();
        
        while (start <= ender){
            System.out.printf("%d X %d = %d\n", userNumber, start, userNumber * start++);
        }        
    }
}
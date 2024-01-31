/*
Name:   Gil
Date:   January 23, 2024

change again

Need a function 
        System.out.print("__: ");
        __ = keyboard.nextDouble();

*/
import java.util.Scanner;

public class TravelCostCalculator 
{ 
    public static void main (String [] args)
    {
        double googleTravelMiles,
               googleTravelTime,
               pricePerMile,
               pricePerHour,
               mileageCost,
               timeCost,
               totalCost;
        try (Scanner keyboard = new Scanner(System.in)) {
            
            System.out.print("Enter Google travel miles: ");
            googleTravelMiles = keyboard.nextDouble();
            System.out.print("Enter Google travel time in minutes: ");
            googleTravelTime = keyboard.nextDouble();
            System.out.print("Enter price per mile: ");
            pricePerMile = keyboard.nextDouble();
            System.out.print("Enter price per hour: ");
            pricePerHour = keyboard.nextDouble();

            mileageCost = googleTravelMiles * pricePerMile;
            timeCost = (pricePerHour/60) * googleTravelTime;
            totalCost = mileageCost + timeCost;

            System.out.printf("Mileage: $%10.2f\n", mileageCost);
            System.out.printf("Time:    $%10.2f\n", timeCost);
            System.out.printf("Total:   $%10.2f\n", totalCost);
        }      
    }
}

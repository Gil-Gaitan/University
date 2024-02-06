/*
Name:   Gil
Date:   February 5th, 2024
This is a homework assignment for ICS141 - Prof. Addo-Quaye
*/
import java.util.Scanner; // Import keyboard utility

public class GasBillCalculator { 
    public static void main(String[] args){
    
        System.out.println("\n\n****************************************************");
        System.out.println("*                                                  *");
        System.out.println("*        Welcome to my gas bill calculator!        *");
        System.out.println("*                                                  *");
        System.out.println("****************************************************\n\n");
        
        
        //Initialize variables, define select variables
        int prevMonth, currentMonth, gasConsumed;
        double billAmount;
        double tier75 = (75*4.00);     //The base tier charges are set as contstants.
        double tier125 = (125*1.28);
        double tier250 = (250*0.59);

        // Obtain user inputs with keyboard
        try (Scanner buffer = new Scanner(System.in)) {
            System.out.print ("Enter previous month reading: ");
                prevMonth = buffer.nextInt ();
            System.out.print ("Enter current month reading: ");
                currentMonth = buffer.nextInt ();
        }

        //Calculate gas usage for current month
        gasConsumed = currentMonth - prevMonth;

        //Calculate bill based on each tier.
        if (gasConsumed > 450){
            billAmount = ((gasConsumed - 450) * 0.13) + tier75 + tier125 + tier250;
        }
        else if (gasConsumed > 250){
            billAmount = ((gasConsumed - 250) * 0.59) + tier75 + tier125;
        }
        else if (gasConsumed > 125){
            billAmount = ((gasConsumed - 125) * 1.28) + tier75;
        }
        else {
            billAmount = gasConsumed * 4;
        }
        //Print bill amount. Error message is usage is negative.
        if (gasConsumed < 0){
            System.out.println("\n\nError! Gas consumption cannot be a negative number.\n\n");
        }
        else {
            System.out.printf("\n\nConsumption: %d\n", gasConsumed);
            System.out.printf("Total Bill: $%.2f\n\n\n", billAmount);
        }
    }
}
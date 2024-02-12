/*
Name:   Gil
Date:   February 5th, 2024
This is Lab assignment for ICS141 - Prof. Addo-Quaye
*/
import java.util.Scanner; // Import keyboard utility
import java.io.IOException;
import java.io.PrintWriter; //Import File ability

public class PizzaPlanet
{ 
    public static void main(String[] args) throws IOException
    {   
        //Header display
        System.out.println("\n\n****************************************************");
        System.out.println("*                                                  *");
        System.out.println("*            Welcome to Pizza Planet!              *");
        System.out.println("*                                                  *");
        System.out.println("****************************************************\n\n");
        
        //Set finals
        final double pepPrice = 11.99;
        final double chzPrice = 8.99;
        final double hawPrice = 10.99;
        final double brdPrice = 6.99;;
        final String pepString = "Pepperoni Pizzas";
        final String chzString = "Cheese Pizzas";
        final String hawString = "Hawaiian Pizzas";
        final String brdString = "Breadsticks";
        
        //Set and define variables
        String response = "0";
        int userSelection, userQuantity;
        int orderNumber = 1470800;
        int pepTotal = 0;
        int chzTotal = 0;
        int hawTotal = 0;
        int brdTotal = 0;
        int pizTotal = 0;
        double totalBill = 0;

        try (Scanner buf = new Scanner(System.in)) {

            //Loop to add items
            while (!response.equalsIgnoreCase("Done")){
                System.out.printf("\n\n1. Pepperoni Pizza: $11.99\n");
                System.out.printf("2. Cheese Pizza:     $8.99\n");
                System.out.printf("3. Hawaiian Pizza:  $10.99\n");
                System.out.printf("4. Breadsticks:      $6.99\n\n");
            
                System.out.printf("Select Menu Option: ");
                userSelection = buf.nextInt();
            
                switch (userSelection){
                    case 1: //Select Pepperoni Pizza
                        System.out.printf("How many %s: ", pepString);
                        userQuantity = buf.nextInt();
                        totalBill += pepPrice * userQuantity;
                        pepTotal += userQuantity;
                        pizTotal += userQuantity;
                        break;
                    case 2: //Select Cheese Pizza
                        System.out.printf("How many %s: ", chzString);
                        userQuantity = buf.nextInt();
                        totalBill += chzPrice * userQuantity;
                        chzTotal += userQuantity;
                        pizTotal += userQuantity;
                        break;
                    case 3: //Select Hawaiian Pizza
                        System.out.printf("How many %s: ", hawString);
                        userQuantity = buf.nextInt();
                        totalBill += hawPrice * userQuantity;
                        hawTotal += userQuantity;
                        pizTotal += userQuantity;
                        break;
                    case 4: //Select Bread Sticks
                        System.out.printf("How many %s: ", brdString);
                        userQuantity = buf.nextInt();
                        totalBill += brdPrice * userQuantity;
                        brdTotal += userQuantity;
                        pizTotal += userQuantity;
                        break;
                } 
                buf.nextLine();
                System.out.printf("Enter done to complete transaction: ");
                response = buf.nextLine(); //Add another item or done
            }
        }
        //Output for the customer order
        System.out.printf("\n\n");
        System.out.printf("Order Number: %d\n", ++orderNumber);
        if (pepTotal > 0) System.out.printf("%s: %d\n", pepString, pepTotal);
        if (chzTotal > 0) System.out.printf("%s: %d\n", chzString, chzTotal);
        if (hawTotal > 0) System.out.printf("%s: %d\n", hawString, hawTotal);
        if (brdTotal > 0) System.out.printf("%s: %d\n", brdString, brdTotal);
        System.out.printf("Amount Due: $%.2f\n\n", totalBill);
        System.out.println("Please scan your card.\n\n\n");
        //PAYMENT PROCESS
        //PAYMENT CONFIRMATION
        System.out.println("Thank you for your order. It will be ready soon!\n\n"); 
        
        // Log order to .txt file as transaction log and also a sales report
        PrintWriter outfile = new PrintWriter("SalesReport.txt");

        outfile.printf("Order Number Total Charge Pepperoni Cheese Hawaiian Total Pizza Breadsticks\n");
        outfile.printf("************ ************ ********* ****** ******** *********** ***********\n");
        outfile.printf("%-12d %12.2f %9d %6d %8d %11d %11d\n", orderNumber, totalBill, pepTotal, chzTotal, hawTotal, pizTotal, brdTotal);
        outfile.printf("\n");
        outfile.printf("Item             Qty  Tot Rev\n");
        outfile.printf("**************** **** *******\n");
        outfile.printf("%-16s %-4d $%6.2f\n", pepString, pepTotal, pepTotal * pepPrice);
        outfile.printf("%-16s %-4d $%6.2f\n", pepString, chzTotal, chzTotal * chzPrice);
        outfile.printf("%-16s %-4d $%6.2f\n", hawString, hawTotal, hawTotal * hawPrice);
        outfile.printf("%-16s %-4d $%6.2f\n", brdString, brdTotal, brdTotal * brdPrice);
        outfile.close();
    }
}
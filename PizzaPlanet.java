/*
Name:   Gil
Date:   February 5th, 2024
This is Lab assignment for ICS141 - Prof. Addo-Quaye
*/
import java.util.Scanner; // Import keyboard utility
import java.io.*; //Import File ability

public class PizzaPlanet { 
    public static void main(String[] args){
    
        System.out.println("\n\n****************************************************");
        System.out.println("*                                                  *");
        System.out.println("*             Welcome to Pizza Planet!             *");
        System.out.println("*                                                  *");
        System.out.println("****************************************************\n\n");
        
        double pepPrice = 11.99;
        double chzPrice = 8.99;
        double hawPrice = 10.99;
        double brdPrice = 6.99;
        double totalBill = 0;
        String pepString = "Pepperoni Pizzas";
        String chzString = "Cheese Pizzas";
        String hawString = "Hawaiian Pizzas";
        String brdString = "Breadsticks";

        int userSelection;
        int userQuantity;
        String response = "0";
        Scanner buf = new Scanner(System.in);

        while (!response.equalsIgnoreCase("Done")){

            System.out.printf("\n\n1. Pepperoni Pizza: $11.99\n");
            System.out.printf("2. Cheese Pizza:    $11.99\n");
            System.out.printf("3. Hawaiian Pizza:  $11.99\n");
            System.out.printf("4. Breadsticks:     $11.99\n\n");
        
            System.out.printf("Select Menu Option: ");
            userSelection = buf.nextInt();
        
            switch (userSelection){
                case 1:
                    System.out.printf("How many %s: ", pepString);
                    userQuantity = buf.nextInt();
                    totalBill += pepPrice * userQuantity;
                    break;
                case 2:
                    System.out.printf("How many %s: ", chzString);
                    userQuantity = buf.nextInt();
                    totalBill += chzPrice * userQuantity;
                    break;
                case 3:
                    System.out.printf("How many %s: ", hawString);
                    userQuantity = buf.nextInt();
                    totalBill += hawPrice * userQuantity;
                    break;
                case 4:
                    System.out.printf("How many %s: ", brdString);
                    userQuantity = buf.nextInt();
                    totalBill += brdPrice * userQuantity;
                    break;
            }
            buf.nextLine();
            System.out.printf("Enter done to complete transaction: ");
            response = buf.nextLine();
        }
        System.out.printf("\n\nYour total bill is $%.2f\n", totalBill);
        
        //PrintWriter outfile = new PrintWriter(“transactions.txt”)
        //outfile.printf(“Your %s %s”, name, phoneNumber)
    }
}
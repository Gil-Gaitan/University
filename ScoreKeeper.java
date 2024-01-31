/*
Name:   Gil
Date:   January 23, 2024
*/

import java.util.Scanner;

public class ScoreKeeper 
{
    public static void main(String[] args) 
    {
        double 
            score1,
            score2,
            score3,
            averageScore;
        
        try (Scanner keyboard = new Scanner(System.in)) 
        {
            System.out.println("This program averages 3 scores.");
            System.out.print("Enter score #1: ");
            score1 = keyboard.nextDouble();
            System.out.print("Enter score #2: ");
            score2 = keyboard.nextDouble();
            System.out.print("Enter score #3: ");
            score3 = keyboard.nextDouble();
        }

        averageScore = (score1 + score2 + score3) / 3.0;
        
        if (averageScore > 95)
        {
            System.out.println("That's a great score!");
            System.out.println("You are smort!");
        }

        System.out.println("The average is " + String.format("%.2f", averageScore));
    }
}
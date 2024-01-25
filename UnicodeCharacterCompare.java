/*
Name:   Gil
Date:   January 23, 2024
*/

import java.util.Scanner;

public class UnicodeCharacterCompare
{
   public static void main(String[] args)
    {
        System.out.println("This program will compare two unicode characters");

        char
            char1,
            char2;

        try (Scanner keyboard = new Scanner(System.in))
            {
                System.out.print("Enter 1st character: ");
                char1 = keyboard.next().charAt(0);
                System.out.print("Enter different 2nd character: ");
                char2 = keyboard.next().charAt(0);
            }
        
        int unicodeValue1 = char1;
        int unicodeValue2 = char2;
        
        if (char1 > char2)
            {
                System.out.println(char1 + " is greater than " + char2);
                System.out.println(char1 + " = " + unicodeValue1);
                System.out.println(char2 + " = " + unicodeValue2);
            }

        else
            {
                System.out.println(char2 + " is greater than " + char1);
                System.out.println(char1 + " = " + unicodeValue1);
                System.out.println(char2 + " = " + unicodeValue2);
            }
        
    }
}
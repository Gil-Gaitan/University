/*
Name:   Gil
Date:   January 18, 2024
*/

import java.util.Scanner;

public class ProjectileCalculator
{
    public static void main (String [] args)
    {
        final float ACCELERATION = -9.80665F;
        float time, initialVelocity, initialHeight, height, velocity;
        
        try (Scanner buffer = new Scanner (System.in)) 
        {
            System.out.print ("Enter initial height: ");
            initialHeight = buffer.nextFloat ();
            
            System.out.print ("Enter initial velocity: ");
            initialVelocity = buffer.nextFloat ();
            
            System.out.print ("Enter time: ");
            time = buffer.nextFloat ();
        }
        
        velocity = ACCELERATION * time + initialVelocity;
        height = 0.5F * ACCELERATION * time * time + initialVelocity * time + initialHeight;
        
        System.out.println ("When t = " + time);
        System.out.println ("v = " + velocity);
        System.out.println ("h = " + height);
    }
}

/*
Name:   Gil
Date:   January 18, 2024
*/
import java.util.Scanner;

public class PopulationGrowthEstimate {
    public static void main(String[] args){
    
        System.out.println("\n\n****************************************************");
        System.out.println("*                                                  *");
        System.out.println("*    Welcome to my population growth calculator!   *");
        System.out.println("*                                                  *");
        System.out.println("****************************************************\n\n");
        double population = 0.0;
        int generation = 0;
        double growthRate;
        double duration = 0;
        double durationPeriod;
        int finalPopulation;

        try (Scanner buffer = new Scanner(System.in)) {
            System.out.print ("Enter initial population size: ");
                population = buffer.nextInt ();
            System.out.print ("Enter growth rate: ");
                growthRate = buffer.nextDouble ();
            System.out.print ("Enter duration period: ");
                durationPeriod= buffer.nextDouble();
            System.out.print ("Enter final population: ");
                finalPopulation = buffer.nextInt ();
        }

        System.out.printf("\n%-10s%-10s%-10s", "Gen. No.", "Duration", "Population\n");
        System.out.println("========  ========  ==========");

        while (finalPopulation > population) {
            System.out.printf("%8d%10.1f%10.0f\n", generation++, duration, population);
            duration += durationPeriod;
            population = population * growthRate;
        }
        System.out.printf("%8d%10.1f%10.0f\n\n", generation, duration, population);

    }
}

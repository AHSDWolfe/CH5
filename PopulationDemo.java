/**
 * Denver Wolfe
 * CH5PC6 - Population
 * Programming III - AP CS
 * 11/27/18
 */

import java.util.Scanner;

public class PopulationDemo {

    public static void main(String[] args) {
        //Declare Variables
        int population;
        double percentIncrease;
        int days;
        
        //Create Scanner
        Scanner kb = new Scanner(System.in);
        
        Population test = new Population();
        
        //Ask and check for starting size, percent increase, and number of days multiplying
        System.out.print("Enter the starting size for the population: ");
        population = kb.nextInt();
        while(population < 2){
            System.out.println("Starting size should be 2 or more.");
            System.out.println("Enter the starting size for the population: ");
            population = kb.nextInt();
        }
        test.setPopulation(population);
        
        System.out.print("Enter the population's daily percent increase: ");
        percentIncrease = kb.nextDouble();
        while(percentIncrease < 0.0 || percentIncrease > 100.0){
            System.out.println("Population's daily increase should not be"
                    + " negative or over 100");
            System.out.print("Enter the population's daily percent increase: ");
            percentIncrease = kb.nextDouble();
        }
        test.setPercentIncrease(percentIncrease);
        
        System.out.print("Enter the number of days the population will multiply: ");
        days = kb.nextInt();
        while(days < 1){
            System.out.println("Number of days must be greater than 1");
            System.out.print("Enter the number of days the population will multiply: ");
            days = kb.nextInt();
        }
        test.setDays(days);
        
        System.out.println(test.populationPrediction());
    }
}

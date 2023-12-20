import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program can help you predict the future of a population by examining its rate of growth or decay. Please provide the initial and current population sizes, along with the number of years that have passed.");

        Scanner keyboard = new Scanner(System.in);


        while (true) {

            System.out.println("What was the initial population size?");
            double initialPopulation = keyboard.nextDouble();

            System.out.println("What is the current population size?");
            double finialPopulation = keyboard.nextDouble();

            System.out.println("How many years have passed?");
            double years = keyboard.nextDouble();

            GrowthModel model = new GrowthModel(initialPopulation, finialPopulation, years);

            //test
            System.out.println(model.getRateOfGrowth());
            
        }

    }
}
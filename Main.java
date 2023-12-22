import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program can help you predict the future of a population by examining its rate of growth or decay. Please provide the initial and current population sizes, along with the number of years that have passed.");

        Scanner keyboard = new Scanner(System.in);


        while (true) {

            System.out.println("What was the initial population size?");
            double initialPopulation = keyboard.nextDouble();

            System.out.println("What is the current population size?");
            double finalPopulation = keyboard.nextDouble();

            System.out.println("How many years have passed?");
            double years = keyboard.nextDouble();

            GrowthModel model = new GrowthModel(initialPopulation, finalPopulation, years);

            System.out.println("Would you like to:\r\n" +
                    "a.) Know what the population will be after a number of years.\r\n" +
                    "b.) Know the number of years it will take for the population to reach a certain level.");

            keyboard.nextLine();
            char option = keyboard.nextLine().toLowerCase().charAt(0);

            if (option == 'a') {

                System.out.println("How many years into the future would you like to know the population size?");
                double yearsInTheFuture = keyboard.nextDouble();

                double futurePopulation = model.findFuturePopulation(yearsInTheFuture);

                System.out.printf("The population is estimated to be %.2f in %.1f years.\n", futurePopulation, yearsInTheFuture);
            }
            else if (option == 'b') {

                System.out.println("What size population would you like to know about?");
                double futurePopulation = keyboard.nextDouble();

                double yearsIntoTheFuture = model.findYearsIntoTheFuture(futurePopulation);

                System.out.printf("It will take %.1f years for the population to reach %.2f.\n", yearsIntoTheFuture, futurePopulation);
                
            }
            
        }

    }
}
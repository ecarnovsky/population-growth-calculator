import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("About this program...");

        Scanner keyboard = new Scanner(System.in);


        while (true) {

            System.out.println("What was the initial population size?");
            double initialPopulation = keyboard.nextDouble();

            System.out.println("What is the current population size?");
            double finialPopulation = keyboard.nextDouble();

            System.out.println("How many years have passed?");
            double years = keyboard.nextDouble();

            GrowthModel model = new GrowthModel(initialPopulation, finialPopulation, years);

            
        }

    }
}
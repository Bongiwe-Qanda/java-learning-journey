
package projects.project09_Dice_Roller;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring variables
        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();
        int dice_number;
        int total =0;

        // Get number of dice

        System.out.print("Enter the number of dice to roll: ");
        dice_number = scanner.nextInt();

        // check if number of dice > 0
        if(dice_number < 0){
            System.out.println("Number can't be negative.");
        }
        else{
            for(int i = 0; i < dice_number; i ++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.printf("You rolled: %d\n",roll);
                total += roll;
            }
            System.out.printf("Total: %d\n",total);


        }

        // display the ascii art of the dice
    }

    static void printDie(int roll){
        String dice1 = """
                -------
               |        |
               |   ●    |
               |        |
                -------
                """;
        String dice2 = """
                -------
               |  ●     |
               |        |
               |     ●  |
                -------
                """;

        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |      ●|
                -------
                """;



        System.out.println(dice1);

    }
}

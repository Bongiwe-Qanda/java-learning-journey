package projects.project11_Rock_Paper_Scissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ROCK PAPER SCISSORS PROGRAM FLOW
        1. Ask user to choose
        3. Create random choice generator for user
        2. If statement to asess user input against game rules
        3. Re-prompt user
        4.
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String user_choice;
        String computer_choice;
        String[] computer_choices = {"rock","paper","scissors"};
        String want_to_continue = "yes";

        do{
            System.out.print("Enter your choice (rock,paper,scissors): ");
            user_choice = scanner.nextLine().toLowerCase();

            if(!user_choice.equals("rock") &&
                    !user_choice.equals("paper") &&
                    !user_choice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }


            computer_choice = computer_choices[random.nextInt(3)];
            System.out.printf("Computer choice: %s\n", computer_choice);

            if(user_choice.equals(computer_choice)){
                System.out.println("It's a tie!!");
            }
            else if(user_choice.equals("rock") && computer_choice.equals("scissors")){
                System.out.println("You win!!!🌟");
            }
            else if(user_choice.equals("paper") && computer_choice.equals("rock")){
                System.out.println("You win!!!🌟");
            }
            else if(user_choice.equals("scissors") && computer_choice.equals("paper")){
                System.out.println("You win!!!🌟");

            }
            else{
                System.out.println("You lose!!!👎");
            }

            System.out.print("Do you want to continue playing? (yes/no): ");
            want_to_continue = scanner.nextLine().toLowerCase();


        }while(want_to_continue.equals("yes"));

        System.out.println("Thank you for playing!!");


    scanner.close();
    }
}


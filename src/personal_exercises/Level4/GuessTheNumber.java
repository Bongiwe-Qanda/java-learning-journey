package personal_exercises.Level4;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int secretNumber;
        int guess;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        secretNumber = random.nextInt(1,50);

    while(true) {
        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();

        if (guess < secretNumber) {
            System.out.println("Too low");
        } else if (guess > secretNumber) {
            System.out.println("Too high");
        }
        else{
            System.out.println("Correct !!");
            break;
        }

    }
    }
}

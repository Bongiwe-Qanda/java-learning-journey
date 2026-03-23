package projects.project07_Number_Guessing_Game;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 7;
        int max = 80;
        int randomNumber = random.nextInt(min,max+1);

        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("Guess a number from %d-%d\n",min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts ++;

            if( guess < min || guess > max  ){
                System.out.println("Enter a number within the specified range");
            }

            else if(guess > randomNumber){
                System.out.println("Too High, go lower!!");
            }
            else{
                    System.out.println("Too Low, go higher!!");
                }

        }while(guess != randomNumber);

        System.out.printf("You have won after %d attempts!!!",attempts);


        scanner.close();
        }


    }


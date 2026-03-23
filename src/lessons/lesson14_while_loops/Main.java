package lessons.lesson14_while_loops;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
    while loop = repeating some code while a certain condition remains true
                 if the condition becomes false, the loop is exited
                 helpful when we don't want a user to continue without doing something
                 BE CONSCIOUS OF INFINITE LOOPS!!!

     */
        // Agame: for the user to quit they have to press the q key
        Scanner scanner = new Scanner(System.in);

        String answer = "";

        while(!answer.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit: ");
            answer = scanner.nextLine().toUpperCase();

        }
        System.out.println("You quit playing the game.");




        scanner.close();
    }

}

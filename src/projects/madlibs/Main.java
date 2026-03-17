package projects.madlibs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Mad libs game

        Scanner prompt = new Scanner(System.in);

        System.out.println("Enter an adjective: ");
        String adjective1 = prompt.nextLine();

        System.out.println("Enter another adjective: ");
        String adjective2 = prompt.nextLine();

        System.out.println("Enter a type of bird: ");
        String bird = prompt.nextLine();

        System.out.println("Enter any room in a house: ");
        String room = prompt.nextLine();

        System.out.println("Enter a verb(past tense): ");
        String verb1 = prompt.nextLine();

        System.out.println("Enter a verb: ");
        String verb2 = prompt.nextLine();


        System.out.println("It was a " + adjective1 + " November day. I woke up to the " + adjective2 +
         " smell of " + bird + " roasting in the " + room + ". I " + verb1 + " down the stairs to see if I could help " +
                verb2 + " the dinner.");

        prompt.close();

    }

}

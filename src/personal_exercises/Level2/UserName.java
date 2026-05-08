package personal_exercises.Level2;
import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = scanner.nextLine();

        System.out.println("Hello, " + name);


    }

}

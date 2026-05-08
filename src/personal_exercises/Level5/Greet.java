package personal_exercises.Level5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = scanner.nextLine();

        greet(name);
    }

    static void greet(String name){
        System.out.println("Hello, " + name);
    }
}


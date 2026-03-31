package projects.projects10_Quiz_Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          /*
    Quiz Game: Create an array of my own custom questions
                2-D Array of all the different options
     PROJECTS BREAKDOWN:
     1.  An array of questions
     2.  Options - 2D Array
     3.  Array for correct answers
     3.  Declare variables
     4.  Welcome message
     5. List question using loop
            -> List options
            -> Get guess from user
            -> check if guess is correct
    6. Display final score

     */
    String[] questions = {"Which is the only sea in the world without any coastlines?",
            "What is the smallest country in the world?",
            "Which artist painted \"The Starry Night\"?",
            "What is the national animal of Australia?",
            "Which gas makes up the majority of Earth's atmosphere?"};

    String[][] options = {
            {"1. Dead Sea","2. Sargasso Sea","3 .Caribbean Sea","4. Caspian Sea","5. Red Sea"},
            {"1. Monaco","2. Nauru","3. Vatican City","4. San Marino","5. Liechtenstein"},
            {"1. Claude Monet","2. Salvador Dalí","3. Vincent van Gogh","4. Pablo Picasso","5. Edvard Munch"},
            {"1. Koala","2. Emu","3. Red Kangaroo","4. Platypus","5. Wombat"},
            {"1. Oxygen","2. Carbon Dioxide","3. Nitrogen","4. Hydrogen","5. Argon"}};
//
//
//        String[] correct = {"Sargasso Sea","Vatican City","Vincent van Gogh","Red Kangaroo","Nitrogen"};
//

        int[] answers = {2,3,3,3,3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("WELCOME TO THE ULTIMATE QUIZ GAME!!!");
        System.out.println("***************************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option: options[i]){
                System.out.println(option);

            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("*******");
                System.out.println("CORRECT!!😊");
                System.out.println("*******");
                score += 1;
            }
            else{
                System.out.println("*******");
                System.out.println("WRONG!!😔");
                System.out.println("*******");
            }
        }
        System.out.printf("You got %d/5",score);

        scanner.close();
    }


}

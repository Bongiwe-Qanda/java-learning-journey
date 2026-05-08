package personal_exercises.Level3;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        double score;

        Scanner scanner =  new Scanner(System.in);

        System.out.print("What is the score: ");
        score = scanner.nextDouble();

        if(score > 90){
            System.out.println("A");
        } else if (score > 80) {
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }

    }
}

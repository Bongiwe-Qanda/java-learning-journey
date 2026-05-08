package personal_exercises.Level3;

import java.util.Scanner;

public class Determiner {
    public static void main(String[] args) {
        double num;

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter any number: ");
        num = scanner.nextDouble();

        if(num > 0){
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}

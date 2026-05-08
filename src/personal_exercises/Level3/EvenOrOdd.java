package personal_exercises.Level3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        double num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scanner.nextDouble();

        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

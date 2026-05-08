package personal_exercises.Level2;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double firstNumber ;
        double secondNumber ;

        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        System.out.println("Sum = " + sum);

    }
}

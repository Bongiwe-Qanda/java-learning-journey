package personal_exercises.Level2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double temperature;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        temperature = scanner.nextDouble();

        double newTemperature = (temperature * 9/5) + 32;
        System.out.printf("The temperature is %.2f Fahrenheit",newTemperature);

    }


}

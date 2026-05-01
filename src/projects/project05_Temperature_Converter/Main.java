package projects.project05_Temperature_Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit (C or F): " );
        String unit = scanner.next().toUpperCase();

        double newTemp = (unit.equals("C")) ? (temperature - 32) * 5/9 : (temperature * 9/5) + 32;

        System.out.printf("%.2f° %s",newTemp,unit);

        scanner.close();

    }

}

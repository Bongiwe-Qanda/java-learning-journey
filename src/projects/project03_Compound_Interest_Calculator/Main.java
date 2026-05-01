/*
COMPOUND INTEREST CALCULATOR

A = P( 1 + r/n)^ (n*t)
 */

package projects.project03_Compound_Interest_Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double p = scanner.nextDouble();

        System.out.println("Enter the interest rate(in %): ");
        double r = scanner.nextDouble() / 100;

        System.out.println("Enter the times compounded per year: ");
        int n = scanner.nextInt();

        System.out.println("Enter the number of years: ");
        int t = scanner.nextInt();

        double a = p * Math.pow((1 + (r/n)),(n*t) );
        System.out.printf("The amount after %d years is R%.2f",t,a);

        scanner.close();
    }
}



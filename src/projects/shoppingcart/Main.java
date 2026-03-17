/*
A shopping cart program where a user can type in a product, how much it costs and how many
they want and return the items in the shopping cart and the total.
 */


package projects.shoppingcart;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);

        System.out.println("What item would you like to buy?: ");
        String item = prompt.nextLine();

        System.out.println("What is the price for each?: ");
        double price = prompt.nextDouble();

        System.out.println("How many would you like to buy?: ");
        int quantity = prompt.nextInt();

        double total = price * quantity;

        System.out.println("You bought " + quantity  + " " + item + "/s.");
        System.out.println("Your total is R" + total);

}
}

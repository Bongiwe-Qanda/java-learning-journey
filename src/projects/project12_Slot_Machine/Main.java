package projects.project12_Slot_Machine;
import java.util.Scanner;

public class Main {
    public Main() {
        super();
    }

    public static void main(String[] args) {
        // JAVA SLOT MACHINE - a slot machine where a user is going to bet an amount for the symbols, if the user gets
        //                     any matching symbols they get receive a payout. At the end they receive their balance

        // Declare variables
        Scanner scanner = new Scanner(System.in);
        int balance = 50;
        int bet;
        int payout;
        String[] row;

        // Display welcome message
        System.out.println("**************************");
        System.out.println("WELCOME TO JAVA SLOTS");
        System.out.println("Symbols : 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("**************************");

        // Play if Balance > 0
        System.out.printf("Current balance: R%d\n",balance);


        // Enter bet amount

        System.out.print("Enter your bet amount: ");
        bet = scanner.nextInt();

            // Verify if bet > balance
        if(bet > balance )
            //  Verify if bet > 0
            // Subtract bet from balance

        // Spin row
        // Print row
        // Get a payout if there are matches
        // Ask to play again
        // Display exit message

    scanner.close();
    }


}

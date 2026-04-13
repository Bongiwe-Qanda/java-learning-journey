package projects.project12_Slot_Machine;
import java.util.Scanner;

public class Main {

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


        // Play if balance > 0
        while(balance > 0){
            System.out.printf("Current balance: R%d\n",balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

        // verify if bet < balance
            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS!!");
                continue;
            }
        //  verify if bet is > 0
            else if(bet <= 0) {
                System.out.println("Bet MUST be greater that 0");
                continue;

            }
        // Subtract bet from balance
            else{
                balance -= bet;
                System.out.printf("Balance: R%d\n",balance);
            }
        }


        // Spin row
        // Print row
        // Get a payout if there are matches
        // Ask to play again
        // Display exit message

    scanner.close();
    }


}

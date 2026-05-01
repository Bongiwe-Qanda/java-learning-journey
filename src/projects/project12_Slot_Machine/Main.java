package projects.project12_Slot_Machine;
import java.util.Random;
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
        String playAGain;

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
            scanner.nextLine();

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
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0){
                System.out.println("You won R" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you lost this round.");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAGain = scanner.nextLine().toUpperCase();

            if(!playAGain.equals("Y")){
                break;
            }
        }
        System.out.println("GAME OVER!!! Your final balance is R" + balance);
    scanner.close();
    }
    // Spin row of symbols
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    // Print row
    static void printRow(String[] row){
        System.out.println("******************");
        System.out.println(" " + String.join(" | ",row));
        System.out.println("******************");
    }
    // Get a payout if there are matches
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;};
        }
        else if(row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        return 0;

    }

}

// Ask to play again
// Display exit message

package projects.projects08_Banking_Program;
import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        PROGRAM FLOW:
         1. Declare variables
         2. Display a menu
         3. Get and process user choice
         4. showBalance method
         5. deposit()
         6. withdraw()
         7. exit()
         8. Exit message
         */

        double balance = 10.0;
        boolean isRunning = true;
        double deposit;
        double withdrawal;
        int choice;

        while (isRunning){
                System.out.println("========== BANKING PROGRAM ==========");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.print("Enter your choice (1-4): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> showBalance(balance);
                    case 2 -> balance += deposit();
                    case 3 -> balance -= withdraw(balance);
                    case 4 -> isRunning = false;
                    default -> System.out.println("Invalid choice");
            }

        }

        System.out.println("=====THANK YOU!!=====");
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("R%.2f\n",balance);

    }
    static double deposit(){

        double amount_deposited;

        System.out.print("Enter the amount to be deposited: ");
        amount_deposited = scanner.nextDouble();

        if(amount_deposited< 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else{
            return amount_deposited;
        }



    }
    static double withdraw(double balance){

        double amount;

        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds!!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }

}

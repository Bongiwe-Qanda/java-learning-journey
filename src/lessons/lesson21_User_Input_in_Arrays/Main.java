package lessons.lesson21_User_Input_in_Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] meals;
        int size;

        System.out.print("How many meals do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        meals = new String[size];

        for(int i = 0; i < meals.length; i ++){
            System.out.print("Enter a meal: ");
            meals[i] = scanner.nextLine();
        }

        for(String meal: meals){
            System.out.println(meal);
        }

        scanner.close();
    }
}

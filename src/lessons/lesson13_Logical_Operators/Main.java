/*
Logical operators allow us to check or modify more than one condition
&& = and
|| = or
! = not

 */

package lessons.lesson13_Logical_Operators;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Username must be between 4-12 characters
            // Username must not contain spaces or underscores

            String username;
            System.out.println("Enter your username: ");
            username = scanner.nextLine();

            if(username.length() <4 || username.length() > 12){
                System.out.println("Username must be between 4-12 characters");
            }
            else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
            else{
                System.out.printf("Welcome %s",username);
            }
scanner.close();
            }



}

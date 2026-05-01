/*

Enhanced switches > a replacement to many else if statements
Improves code by reducing redundancy
Good for efficiency, they enhance code
 */
package lessons.lesson12_Enhanced_Switches;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = scanner.next();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday😒.");
            case "Saturday", "Sunday"-> System.out.println("It is the weekend😊.");
            default -> System.out.printf("%s is not a day.",day);
        }
    }
}

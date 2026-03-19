/*

Nested if statements = conditional statements within conditional statements
 */

package lessons.lesson08_nested_if_statements;

public class Main {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double ticket_price =  9.99;

        if(isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%!");
                System.out.println("You get a student discount of 10%!");
                ticket_price *= 0.7;

            }
            else {
                System.out.println("You get a student discount of 10!");
                ticket_price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a discount of 20%!");
                ticket_price *= 0.8;

            }
            }

        System.out.printf("The price of a ticket is R%.2f",ticket_price);
    }
}

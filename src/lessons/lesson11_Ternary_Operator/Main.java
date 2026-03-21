/*
ternary operator ? = Returns 1 of two values if a condition is true

variable = (condition) ? ifTrue : ifFalse
 */

package lessons.lesson11_Ternary_Operator;

public class Main {
    public static void main(String[] args) {

        int income = 60000;

        double taxrate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxrate);
    }
}

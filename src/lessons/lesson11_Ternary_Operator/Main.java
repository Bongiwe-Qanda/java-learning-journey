package lessons.lesson11_Ternary_Operator;

public class Main {
    public static void main(String[] args) {
    /*
    ternary operator ? = Returns 1 of two values if a condition is true

    variable = (condition) ? ifTrue : ifFalse
     */

        int score = 55;

        String passorFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passorFail);
    }
}

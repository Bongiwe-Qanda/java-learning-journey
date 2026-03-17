package lessons.lesson03_arithmetic;

public class Main {
    public static void main(String[] args) {

        /*
        Arithmetic operators and their uses
        z =  x + y  addition
        z = x - y   subtraction
        z = x * y   multiplication
        z =  x / y  division
        z = x % y   modular operation

        Augmented Assignment Operator
        x +=y and so on for all of them

        Increment and Decrement Operators(increase or decrease by one)

        Increment : x++
        Decrement : x--

        Order of Operations : P(parenthesis) - E(exponent) - M(multiplication) - D(division) - A(addition) - S(subtraction)

         */

        double result = 3 + 4 * (8 - 5) / 2.0;
        System.out.println(result);
    }
}

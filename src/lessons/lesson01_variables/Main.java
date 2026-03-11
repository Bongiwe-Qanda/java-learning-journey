package lessons.lesson01_variables;

public class Main {
    public static void main(String[] args) {
        /*
        Variables are containers for values.
        There are two kinds of variables: primitive and reference

        Primitive -  variables that store the actual values directly
        Reference - variables that store the memory addresses

        PRIMITIVE DATA TYPES:
            Integer(int): whole numbers
            Double(double): Decimal point number
            Character(char): a single character enclose in single quotation marks ''
            Boolean: True or False

        REFERENCE DATA TYPES:
        String: a series of characters
        Array:
        Object:

        When creating a variable, you declare it and then assign a value to it.
        - start with the data type of the value to be stored

        */
        int age = 54;
        double price = 20.52;
        char currency = 'R';
        boolean isRich = true;

        String name = "Bongiwe Qanda";

        System.out.println("I am " + age + " years old.");
        System.out.println("I have R" + price + " in my account.");
        System.out.println("The South African Currecy is " + currency);
        System.out.println("Hello " + name + " !!");
        if (isRich) {
            System.out.println("You are rich!");
        } else {
            System.out.println("You are broke!");
        }


    }
}


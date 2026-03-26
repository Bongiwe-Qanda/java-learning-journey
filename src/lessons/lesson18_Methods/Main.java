package lessons.lesson18_Methods;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Method = a block of reusable code that is executed whenever it called.

        To create a method we need a Return type, a descriptive name of the method and the statements

        Methods are unfamiliar with variables declared within other methods
        To be able to use variables from other methods in another method is to pass arguments
         */
//        String name = "Bongiwe";
//        int age = 23;
//
//        happyBirthday(name, age);

//
//      double result = squared(5);
//      System.out.println(result);
//      double answer = cubed(3);
//      System.out.println(answer);

//        String fullName = getFullName("Bongiwe","Qanda");
//        System.out.println(fullName);

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?:  ");
        int age = scanner.nextInt();

        if(ageCheck(age)){
            System.out.println("You may sign up!!");
        }
        else{
            System.out.println("You must be 18+ to sign up!");
        }
    }

    static void happyBirthday(String myName, int myAge){
            System.out.println("Happy Birthday to you.");
            System.out.printf("Happy Birthday dear %s.\n", myName);
            System.out.printf("You are %d years old\n",myAge);
            System.out.println("Happy Birthday to you!!!!\n");

    }

    static double squared(double myNum){
        return Math.pow(myNum, 2);
    }

    static double cubed(double number){
        return Math.pow(number,3);
    }

    static String getFullName(String name, String lastname){
        return name + " " + lastname;
    }

    static boolean ageCheck(int age){
        return age >= 18;
    }

}

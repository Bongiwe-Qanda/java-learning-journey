package lessons.lesson04_if_statements;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
         An if statement performs a block of code if the condition is true.

         */
        Scanner prompt = new Scanner(System.in);


        System.out.println("Enter your age: ");
        int age = prompt.nextInt();


        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }

        else if(age < 0){
            System.out.println("You aren't even born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child!");
        }

        prompt.close();
    }
}

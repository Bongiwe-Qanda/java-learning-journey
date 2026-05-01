package lessons.lesson02_UserInput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    /*
    To accept user input we use the Scanner class, it should be imported from java.util and create a scanner object.
    To get rid of the input buffer, when you accept an input of an integer or a double use scanner.nextLine() method after
    Open the new scanner method and don't forget to close it

     */
        System.out.println("---JUST CODING ALONG WITH BROCODE---");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("What is your GPA: ");
    double gpa = scanner.nextDouble();

    System.out.println("Are you a student? (true/false): ");
    boolean isStudent = true;

    System.out.println("Welcome " + name);
    System.out.println("You are " + age + " years old.");
    System.out.println("Your gpa is " +  gpa);
    //System.out.println("Student: " + isStudent);
    if(isStudent){
        System.out.println("You are enrolled as a student.");
    }
    else{
        System.out.println("You are not enrolled as a student");
    }

        System.out.println("---PRACTISE EXERCISE: CALCULATE THE AREA OF A RECTANGLE---");

    double breadth = 0;
    double height = 0;
    double area = 0;

    System.out.println("Enter the breadth of the rectangle: ");
    breadth = scanner.nextDouble();

    System.out.println("Enter the height of the rectangle: ");
    height = scanner.nextDouble();

    area = breadth * height;
    System.out.println("THe area is " + area + " cm^2");


    scanner.close();
    }

}

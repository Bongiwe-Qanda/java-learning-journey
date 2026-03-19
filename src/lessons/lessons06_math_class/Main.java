package lessons.lessons06_math_class;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {

        /*
        We have built-in math constants(pi and eulers)

         */
//  ===============LESSON==========================
//        double power = Math.pow(2,3);
//        double square = Math.sqrt(81);
//        double absolute = Math.abs(-56);
//        double round = Math.round(7.89);
//        double roundup = Math.ceil(6.56);
//        double rounddown = Math.floor(6.56);
//        double maximum = Math.max(10,36);
//        double minimum = Math.min(10,34);
//
//        System.out.println(power);
//        System.out.println(square);
//        System.out.println(absolute);
//        System.out.println(round);
//        System.out.println(roundup);
//        System.out.println(rounddown);
//        System.out.println(maximum);
//        System.out.println(minimum);
//
        System.out.println("==================EXERCISE1========================== ");

    // Find the hypotenuse of a right-angle triangle, c = Math.sqrt(a^2 + b^2)

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of b");
        double b = scanner.nextDouble();


        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.printf("The hypotenuse is: %.2fcm\n",c);


        System.out.println("==================EXERCISE2==========================");
      // Given the radius of a circle/sphere; return the circumference, area and volume:
      // Circumference = 2 * pi * radius
      // Area = Math.PI * radius^2
     //  Volume = (4/3) * pi * radius ^3

        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);
        double volume =  (4.0/3.02) * Math.PI * Math.pow(radius,3);

        System.out.printf("Circumference: %.2fcm\n",circumference);
        System.out.printf("Area: %.2fcm^2\n",area);
        System.out.printf("Volume: %.2fcm^3\n",volume);


            scanner.close();    
    }
}

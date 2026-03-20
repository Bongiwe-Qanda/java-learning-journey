package projects.project04_Weight_Converter_Program;
import java.awt.*;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            System.out.println("Weight Conversion Program");
            System.out.println("1: Convert lbs to kgs");
            System.out.println("2: Convert kgs to lbs");

            Scanner scanner =  new Scanner(System.in);

            System.out.println("Choose an option: ");
            String option = scanner.nextLine();

            if(option.equals("1")){
                System.out.println("Enter the weight in lbs: ");
                double weight = scanner.nextDouble();

                double new_weight = weight * 0.453592;
                System.out.printf("The new weight in kgs: %.2fkgs\n",new_weight);

            }
            else if(option.equals("2")){
                System.out.println("Enter the weight in kgs: ");
                double weight = scanner.nextDouble();

                double new_weight = weight * 2.20462;
                System.out.printf("The new weight in kgs: %.2flbs\n",new_weight);
            }
            else{
                System.out.println("That was not a valid choice. Try Again.");
            }

            scanner.close();

        }
}

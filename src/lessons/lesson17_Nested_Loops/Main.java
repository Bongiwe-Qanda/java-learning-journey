package lessons.lesson17_Nested_Loops;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //nested loop = A loop inside a loop
        // Often used in data structures and algorithms
        // Often used in matrices


        System.out.println("========== SYMBOL MATRIX =========");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        char symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i ++){
            for(int j = 0 ; j < columns; j ++){
                System.out.print(symbol);
            }
            System.out.println();
        }


        scanner.close();

    }
}

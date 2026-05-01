package lessons.lesson22_Searching_Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int target;
        boolean isFound = false;

        System.out.print("Enter your target: ");
        target = scanner.nextInt();

        for(int i = 0; i < numbers.length; i ++){
            if(target == numbers[i]){
                System.out.printf("Element found at index: %d", i);
                isFound = true;
                break;
            }

        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }
    }
}

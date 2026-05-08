package personal_exercises.Level4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        int times;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What number do you want to create a multiplication table for? ");
        num = scanner.nextInt();

        System.out.print("How many times do you want to multiply? ");
        times = scanner.nextInt();


        for(int i = 1; i < times+1; i ++){
            int product = num * i;
            System.out.printf("%d * %d = %d\n",num,i,product);
        }


    }

}

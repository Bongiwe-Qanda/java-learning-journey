package personal_exercises.Level5;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        a = scanner.nextInt();

        System.out.print("Enter an integer: ");
        b = scanner.nextInt();

        max(a,b);
    }

    static void max(int a,int b){
        System.out.println(Math.max(a,b));
    }
}

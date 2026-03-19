/*
Working with the random class and generating random numbers(ints/ doubles)

 */

package lessons.lesson05_random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        double number1 = random.nextDouble();
        int number2 = random.nextInt(1,7);
        int number3 = random.nextInt(1,7);
        boolean isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("TAILS");
        }
    }

}

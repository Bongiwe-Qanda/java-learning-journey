package lessons.lesson15_for_loops;

import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        for loop -> execute some code for a certain amount of times
        for(counter(how many times we have iterated[loop control variable]);condition; step)
        for(initialization; condition; update)
         */

        /*
        The Interruption exception typically occurs when a thread running the
        method is interrupted while it is sleeping, waiting or otherwise paused in its execution.
         */

        // SIMULATING A COUNTDOWN
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);

        }

        System.out.println("HAPPY NEW YEAR!!!!!!🎊");
    }
}


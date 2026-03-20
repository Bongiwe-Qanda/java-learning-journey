/*
stringname.substring() = a method used to extract a porting of a string(like string slicing in python)
                         stringname.subtring(start index,end index)
 */

package lessons.lesson10_substrings;

import org.ietf.jgss.GSSName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // EMAIL SLICER PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.printf("Username: %s\n", username);
        System.out.printf("Domain: %s\n", domain);

    }
}

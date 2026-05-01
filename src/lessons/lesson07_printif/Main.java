/*
Printf is a method used to format the output.
You have to manually do new line statements

%[flags][width][.precision][specifier-character]

% >>> placeholder
[.precision] >>> useful for displaying prices
[flags] >>>
            + (to output a plus before positive numbers)
            , (comma grouping separator)
            (  (negative numbers are enclosed with ())
            space (display a minus if negative, space if positive) and good for aligning numbers
[width] >>>
            0 = zero padding
            number = right justified padding
            negative number = left justified padding


specific characters for different data types:
String - s(to print out the exact same string)/ S(to display in ALL CAPS)
char -  c
int - d
double - f
boolean - b

 */

package lessons.lesson07_printif;

public class Main {
   public static void main(String[] args) {
       String name = "Bongiwe";
       char firstletter = 'B';
       int age =  23;
       double height = 1.7;
       boolean isStudent = true;

       System.out.printf("Hello %s.\n",name);
       System.out.printf("The first letter of your name is %c.\n",firstletter);
       System.out.printf("You are %d years old.\n",age);
       System.out.printf("Your height is %.2fm.\n",height);
       System.out.printf("Student: %b\n",isStudent);


       double price1 = 8996.56;
       double price2 = -56.89;
       double price3 = 780000.87;

       System.out.printf("% .2f\n",price1);
       System.out.printf("% .2f\n",price2);
       System.out.printf("% .2f\n",price3);

       System.out.println("============ LEARNING FLAGS===========");
       int id1 = 2;
       int id2 = 25;
       int id3 = 7890;
       int id4 = 786955;

       System.out.printf("%07d\n",id1);
       System.out.printf("%-6d\n",id2);
       System.out.printf("%9d\n",id3);
       System.out.printf("%12d\n",id4);




   }
}

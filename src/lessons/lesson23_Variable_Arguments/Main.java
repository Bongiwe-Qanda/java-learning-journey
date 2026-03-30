package lessons.lesson23_Variable_Arguments;

public class Main {
    public static void main(String[] args) {
        /*
        varargs -> allows a method to accept a varying number of arguments.
                -> makes methods more flexible(no overload methods are needed)
                -> java compiler packs arguments into an array
                -> one method that accepts many different variables
                -> ...j
         */

        System.out.println(add(1,2,3,4));
        System.out.println(average(2,3,4,5));
        }

        static int add(int... numbers){

        int sum = 0;


        for(int number : numbers){
            sum += number;
        }
        return sum;
        }
        static double average(int... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }
        else{
        for(double number: numbers){
            sum += number;
        }
        return sum /  numbers.length;
        }

}
}





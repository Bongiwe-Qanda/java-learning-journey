package lessons.lesson21_Arrays;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        /*
        Array -> a collection of values of the same data type
        length of an array -> array.length
        Enhanced for loop is used to iterate over a collection.
        A variable that can store more than one value of the sae data types.
         */

        String[] vegetables = {"Cabbage", "pumpkin", "Spinach" , "Beetroot"};
//
//        for(int i = 0; i < vegetables.length; i++){
//            System.out.println(vegetables[i]);
//        }

                //Sorting an array alphabetically or in ascending order
//            Arrays.sort(vegetables);



                // enhanced for loop
            for(String vegetable : vegetables){
                System.out.println(vegetable);
            }
    }
}

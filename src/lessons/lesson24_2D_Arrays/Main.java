package lessons.lesson24_2D_Arrays;

public class Main {
    public static void main(String[] args) {
//        /*
//        2d array -> an array where each element is an array. It is useful for storing a matrix of data.
//
//         */
//        // One-dimensional arrays
//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "beetroot", "onion"};
//        String[] meat = {"chicken", "beef", "lamb", "fish"};
//
//        //2-D Array -> each element will be an array
//
//        String[][] groceries = {fruits, vegetables, meat};
//
//        //Display elements in a grid like structure, each row is a separate array
//       groceries[0][0] = "pineapple"; // to replace elements
//        for(String[] food: groceries){
//            for(String item: food){
//                System.out.print(item + " ");
//
//            }
//            System.out.println();
//
//        }

//  A 2-D ARRAY THAT RESEMBLES A PHONE KEYPAD
        char[][] telephone = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}
        };

        for(char[] row:telephone){
            for( char key: row){
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }

}

package lessons.lesson16_break_and_continue;

public class Main {
    public static void main(String[] args) {

        /*
        break = break out of a loop(STOP THE LOOP)
        continue = skip current iteration of a loop (SKIP THE CURRENT ITERATION)

         */
        for(int i = 0; i < 10; i ++){
            if(i == 5){
                continue;
            }
            else{
                System.out.println(i);
            }

    }
//        for(int i = 0; i > 10; i ++){
//            if(i == 5){
//                break;
//            }
//        else{
//                System.out.println(i);
//            }
//        }
   }
}

package personal_exercises.Level4;

public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i < 101; i++){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}

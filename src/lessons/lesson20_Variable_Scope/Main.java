package lessons.lesson20_Variable_Scope;

public class Main {

    static  int x = 3;  //Class scope variable

    public static void main(String[] args) {
        /*
        Variable scope = refers to where a variable can be accessed

            > Local scope variable = a variable declared inside a method, can only be accessed within that method

            > Class scope variable = declared inside a class but not within any methods(usually at the top)

            > it is LEGAL to have variables with the same names as long as they are in different methods

            > local variable takes precedence if the local and class variables have the same name
         */

        int x = 1;         //local

    doSomething();
    }
    static void doSomething(){
        int x = 2;      //local
        System.out.println(x);
    }
}

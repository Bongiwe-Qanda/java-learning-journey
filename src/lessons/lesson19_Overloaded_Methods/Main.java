package lessons.lesson19_Overloaded_Methods;

public class Main {
    public static void main(String[] args) {
        /*
        overloaded methods = methods that share the same name but different parameters
                             signature = name + parameters
         */
        String pizza = bakePizza("flatbread", "mozzarella", "Pepperoni");
        System.out.println(pizza);

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";

    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping+ " "+ cheese + " " + bread + " pizza";

    }
}


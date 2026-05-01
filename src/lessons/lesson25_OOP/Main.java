package lessons.lesson25_OOP;

public class Main {
    public static void main(String[] args){
        /*
            Object -> An object that holds data(attributes)
                       and can perform actions( methods)
                       It is a reference data type
         */

        Car car = new Car();

        car.start();
        car.drive();
        car.brake();
        car.stop();
    }
}

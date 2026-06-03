package lessons.lesson36_polymorphism;

/*
Polymorphism : Poly --> many
               Morph --> shape
               Objects can identify as other objects
               Objects can be treated as objects of a common super class

               polymorphism can also be implemented through interfaces
 */

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}

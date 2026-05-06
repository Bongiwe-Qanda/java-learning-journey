package lessons.lesson33_toString;

public class Main {
    public static void main(String[] args) {

        /*
        .toString = Method inherited from the Object class.
                    Used to return the string representation of a string object.
                    By default, it returns a hash code as a unique identifier.
                    It can be overridden to provide meaningful details

         */

        Car car1 = new Car("Ford","Mustang",2026,"Pink");
        Car car2 = new Car("Chevrolet","Corvette",2020,"Blue");
        System.out.println(car1);
        System.out.println(car2);


    }
}

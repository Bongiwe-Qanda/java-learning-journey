package lessons.lesson27_Overloaded_Constructors;

public class Main {
    public static void main(String[] args) {
        /*
        Overloaded constructors -> allow a class to have multiple constructors with different parameter limits.
                                    Enable objects to be initialized in various ways
         */

        User user1 = new User("Bongiwe Qanda");
        User user2 = new User("Bongiwe", "bongiweqanda87@gmail.com");
        User user3 = new User("Bongiwe","bongiweqa@gmail.com",23);
        System.out.println(user2.email);
        System.out.println(user3.age);





    }

}

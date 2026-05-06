package lessons.lesson29_Static;

public class Main {
    public static void main(String[] args) {
        /*
        Static: makes a variable belong to the class rather than to any specific object
                commonly used for utility methods or shared resources.
         */
        Friend friend1 = new  Friend("Sisonke");
        Friend friend2 = new  Friend("Momo");
        Friend friend3 = new Friend("Bob the builder");
        Friend friend4 = new  Friend("Boba");

        Friend.showFriends();
    }

}

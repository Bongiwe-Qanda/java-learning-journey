package lessons.lesson26_Constructors;

public class Main {
    public static void main(String[] args) {
        /*
        A constructor -> a special method to initialize objects.
                        Arguments can be passed to a constructor
                        and initial values can be set up.
                        With constructors, we can create values with unique values

                        this -> refers to the object we are currently working with
         */

        Student student1 = new Student("Bongiwe", 23, 4.0);
        Student student2 = new Student("Bongi", 22, 3.9);
        Student student3 = new Student("Lebohang", 20,3.9);

        System.out.println(student1.name + " is " + student1.age +" years old and has a gpa score of " + student1.gpa);
        System.out.println(student2.name + " is " + student2.age +" years old and has a gpa score of " + student2.gpa);
        System.out.println(student3.name + " is " + student3.age +" years old and has a gpa score of " + student3.gpa);

        student1.study();
        student2.study();
        student3.study();
    }

}

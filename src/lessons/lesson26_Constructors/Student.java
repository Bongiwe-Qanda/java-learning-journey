package lessons.lesson26_Constructors;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String studentName, int studentAge, double studentGpa){
        this.name = studentName;
        this.age = studentAge;
        this.gpa = studentGpa;
        this.isEnrolled = true;

    }
    void study(){
        System.out.println(this.name + " is studying");
    }


}

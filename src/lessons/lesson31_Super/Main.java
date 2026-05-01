package lessons.lesson31_Super;

public class Main {
    public static void main(String[] args) {

        /*
        super = refers to the parent class ( subclass <- superclass)
                used in constructors and method overriding
                calls the parent constructor to initialize attributes

         */
        Person person = new Person("Bongiwe", "Qanda");
        Student student = new Student("Bobby", "Brown",4.0);
        Employee employee = new Employee("Lazola","Nene",230000);

        person.showName();
        student.showName();
        student.showGpa();
        employee.showSalary();

    }

}

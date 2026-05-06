package lessons.lesson34_Abstraction;

public class Main {
    public static void main(String[] args) {
        /*
        abstract = Used to define abstract classes
                   Abstraction is the process of hiding implementation details and only showing essential features
                   Abstract classes can't be instantiated directly
                   Can contain abstract methods (which must be implemented)
                   Can contain concrete methods (which are inherited)

         */
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3,4);
        Triangle triangle = new Triangle(6,7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}

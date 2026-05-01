package lessons.lesson30_Inheritance;

public class Main {
    public static void main(String[] args) {

        /*
        Inheritance = Is when one class inherits attributes and methods from another class
                      Child inherits from parent
                      Multi-level Inheritance : Child <- Parent <- Grandparent
         */
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.is_Alive);
        System.out.println(cat.is_Alive);
        System.out.println(plant.is_Alive);

        System.out.println(dog.lives);
        System.out.println(cat.lives);


        cat.speak();
        dog.speak();
        plant.photosynthesize();


    }
}

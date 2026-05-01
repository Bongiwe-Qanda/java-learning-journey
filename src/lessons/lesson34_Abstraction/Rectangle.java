package lessons.lesson34_Abstraction;

public class Rectangle extends Shape{
    double width;
    double length;

    Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }

}

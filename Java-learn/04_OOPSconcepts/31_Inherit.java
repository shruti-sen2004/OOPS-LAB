import oops.Rectangle;
import oops.Circle;
import oops.Shape;
import oops.Shape_inter;


public class Inherit {
    public static void main(String[] args) {
        // Rectangle r = new Rectangle(10,20);
        // r.draw();
        // r.area();

        Shape shape = new Circle(10); //parent class reference variable can refer to child class object
        shape.draw(); //method call is always on the actual object
        shape.area(); //gets overridden method from Circle class

        Shape_inter shape1 = new Rectangle(10, 20);
        shape1.draw();
        shape1.area();
    }
}


    
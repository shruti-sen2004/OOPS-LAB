// public class Variable {
//   public static void main(String[] args) {
//     int firstVariable = 5; // how to declare variable
//     byte marks = 99;
//     boolean isPassed = true;
//     long population = 1234567890L; // L is used to specify long as it is by default int
//     float percentage = 99.99F; // F is used to specify float as it is by default double
//     double pi = 3.141592653589793238;
//     long salary = 1_50_000; // _ is used to separate digits for better readability, they get ignored
//     System.out.print("Hello World");
//   }
// }


import java.awt.*;  //used for Point class
import java.util.Date; //use for Date class
public class Variable{
    public static void main(String[] args) {
        Date newDate = new Date(); //creates a new object of Date class
        System.out.println(newDate);
        // Primitive types
        int a = 5;
        int b = a;
        a = 7;
        System.out.println(b); //sout + tab (shortcut)

        // Non-primitive types
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
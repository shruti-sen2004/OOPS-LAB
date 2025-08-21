package oops;


// public class Rectangle {
//     private int area;

//     public void draw() {
//         System.out.println("Drawing a rectangle");
//     }

//     public void area() {
//         System.out.println("Area: " + area);
//     }

//     public Rectangle(int length, int breadth) {    //constructor
//         this.area = length * breadth;
//         System.out.println("Rectangle object created");
//     }
// }

public class Rectangle implements Shape_inter {
    private int area;

    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public void area() {
        System.out.println("Area: " + area);
    }

    public Rectangle(int length, int breadth) {    //constructor
        this.area = length * breadth;
        System.out.println("Rectangle object created");
    }
}
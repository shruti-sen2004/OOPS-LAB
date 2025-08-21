package oops;


public class Circle extends Shape{
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {    //constructor
        //super();    //calling the constructor of parent class
        this.radius = radius;
        System.out.println("Circle object created");
    }

    @Override
    public void area() {     //overriding the area method of Shape class
        System.out.println("area: "+ 2*PI*radius);
    }
    
}

    
import java.lang.*;

class Point {
  private int x, y;

  public void setData (int a, int b) {
    x = a; y = b;
  }

  public void show() {
    System.out.println(x + "," + y);
  }

  public void incrementX (int step) {
    x += step;
  }

  //public static void main(String args[]) { // using class under the same class
  //  Point p1;
  //  p1 = new Point();
  //  Point p2 = new Point();
  //
  //  p1.setData(5, 6);
  //  p2.setData(10, 20);
  //
  //  p1.show();
  //  p2.show();
  //
  //  p1.incrementX(2);
  //  p1.show();
  //}
}

class PointTest {
  public static void main(String args[]) {
    Point p1;
    p1 = new Point();
    Point p2 = new Point();

    p1.setData(5, 6); // calling method with Object
    p2.setData(10, 20);

    p1.show();
    p2.show();

    p1.incrementX(2);
    p1.show();

    //System.out.println(p1.x); // cannot access private attribute
  }
}

class CLADemo { // command line access
  public static void main(String args[]) {
    Point p1 = new Point();
    p1.setData(Integer.parseInt(args[0]), Integer.parseInt(args[1])); // convert String to int; calling method with Class
    p1.show();
  }
}

// object, reference, class
// objects have no names - references have name

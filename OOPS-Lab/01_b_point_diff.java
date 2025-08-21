class Point {
  private int x, y;

  // Constructor to initialize the coordinates
  public Point(int a, int b) {
    x = a;
    y = b;
  }

  // Method to display the coordinates
  public void show() {
    System.out.println(x + "," + y);
  }
}

class Main {
  public static void main(String args[]) {
    Point p1 = new Point(5, 6);
    p1.show();
  }
}
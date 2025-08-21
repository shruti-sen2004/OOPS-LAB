import java.util.Scanner;
public class Project {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    double a, u, t;
    do {
      System.out.print("Enter initial speed: ");
      u = scanner.nextDouble();
    } while (u <0);
    
    do {
      System.out.print("Enter acceleration: ");
      a = scanner.nextDouble();
    } while (a <0);
    do {
      System.out.print("Enter time: ");
      t = scanner.nextDouble();
    } while (t <0);
    double s = u * t + 0.5 * a * t * t;
    double s2 = u * t + 0.5 * a * Math.pow(t, 2);
    System.out.println("Distance travelled is: " + s);
    System.out.println("Distance travelled is: " + s2);
  }
}

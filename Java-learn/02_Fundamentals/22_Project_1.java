
import java.util.Scanner;
public class Project_1 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter initial speed: ");
    double u = scanner.nextDouble();
    System.out.print("Enter acceleration: ");
    double a = scanner.nextDouble();
    System.out.print("Enter time: ");
    double t = scanner.nextDouble();
    double s = u * t + 0.5 * a * t * t;           //METHOD-1
    double s2 = u * t + 0.5 * a * Math.pow(t, 2); //METHOD-2
    System.out.println("Distance travelled is: " + s);
    System.out.println("Distance travelled is: " + s2);

    scanner.close();
  }
}


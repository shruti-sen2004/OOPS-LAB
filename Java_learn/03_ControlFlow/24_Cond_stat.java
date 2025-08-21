import java.util.Scanner;
public class Cond_stat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    // int day = sc.nextInt();
    String day = sc.next();
    if (day.equals("1")) {
      System.out.println("Monday");
    } 
    else if (day.equals("2")) {
      System.out.println("Tuesday");
    } 
    else if (day.equals("3")) {
      System.out.println("Wednesday");
    } 
    else {
      System.out.println("Invalid input");
    }

    int a =5;
    int b = a==5 ? 1 : 2;
    System.out.println(b);

    switch (day) {
      case "1":
        System.out.println("Monday");
        break;
      case "2":
        System.out.println("Tuesday");
        break;
      case "3":
        System.out.println("Wednesday");
        break;
      default:
        System.out.println("Invalid input");
    }
  }
}

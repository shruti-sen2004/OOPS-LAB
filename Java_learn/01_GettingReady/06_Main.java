import java.util.Scanner; // Import the Scanner class

public class Main {
  public static void main1(String[] args) {
    System.out.println("Hello World"); //to print the next output in new line
    System.out.print("Shruti Sen"); //to print the next output in the same line
    System.out.println("Hello World");
    System.out.println("Shruti Sen"); 
    //This is a single line comment
    /* This is a block comment
     It can be written in multiple lines
    */
  }

  public static void main2(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    System.out.print("Enter username: ");
    String username = scanner.nextLine(); // Read user input
    System.out.println("Username is: " + username); 

    System.out.print("Enter age: ");
    short age = scanner.nextShort(); // Read user input
    System.out.println("Age is: " + age);
  }
}
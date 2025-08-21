import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();  

        System.out.print("Enter age: ");
        int age = scanner.nextInt(); 

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();  
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();  

        // Creating an Employee object with user input
        Employee emp = new Employee(name, age, employeeId, salary);

        // Displaying Employee details
        emp.displayEmployeeDetails();

        // Closing the scanner
        scanner.close();
    }
}

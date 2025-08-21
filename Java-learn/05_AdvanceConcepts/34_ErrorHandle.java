public class ErrorHandle {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}

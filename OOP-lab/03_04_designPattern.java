public class DesignPattern {

    // Method to draw a triangle
    public static void drawTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to draw a rectangle
    public static void drawRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to draw a square
    public static void drawSquare(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Main method to demonstrate the drawing methods
    public static void main(String[] args) {
        System.out.println("Triangle:");
        drawTriangle(5);

        System.out.println("\nRectangle:");
        drawRectangle(5, 3);

        System.out.println("\nSquare:");
        drawSquare(4);
    }
}
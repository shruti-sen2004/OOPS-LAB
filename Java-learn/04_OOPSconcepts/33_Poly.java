public class Poly {
    public static void main(String[] args) {
        System.out.println("Sum is: " + sum(10, 20));
        System.out.println("Sum is: " + sum(10, 20, 30));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}

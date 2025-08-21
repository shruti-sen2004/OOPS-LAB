import java.util.*;

class Fibonacci {
    public static int fib(int n)
    {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void fibRange(int upper) {
        System.out.print("Fibonacci series of length " + upper + ": ");
        for (int i = 0; i < upper; i++) { 
            System.out.print(Fibonacci.fib(i) + " ");
        }
    }
}

class Main {
    public static void main(String args[])
    {
        Scanner numberObj = new Scanner(System.in);
        int number = Integer.parseInt(args[0]);

        Fibonacci.fibRange(number);
    }
}
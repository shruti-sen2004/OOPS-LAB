import java.util.*;

class Prime {
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    } 
    
    public static void printPrime(int lower, int upper) {
        System.out.print("List of primes between " + lower + "&" + upper + ": ");
        for (int i = lower; i <= upper; i++) {
            if (Prime.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

class Main {
    public static void main(String args[])
    {
        Scanner numberObj = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Usage Main <lower_limit> <upper_limit>");
        } else {
            int lower = Integer.parseInt(args[0]);
            int upper = Integer.parseInt(args[1]);
    
            Prime.printPrime(lower, upper);
        }
    }
}
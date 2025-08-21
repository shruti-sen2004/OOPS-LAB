import java.util.*;

class IsPrime {
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }    
}

class Main {
    public static void main(String args[])
    {
        int number = Integer.parseInt(args[0]);

        if (IsPrime.isPrime(number))
            System.out.println("Is prime");
        else
            System.out.println("Is not prime");
    }
}
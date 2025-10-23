package Exercise;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer n to compute the nth Fibonacci number:");
        
        int n = scanner.nextInt();
        if (n > 0) {
            int fib = fibonacci(n);
            System.out.println("\nThe " + n + "th Fibonacci number is: " + fib);
        }
        return;
    }
}

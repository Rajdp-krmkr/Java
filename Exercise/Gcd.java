package Exercise;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = Math.abs(scanner.nextInt());
        
        System.out.print("Enter second number: ");
        int b = Math.abs(scanner.nextInt());

        if (a == 0 && b == 0) {
            System.out.println("GCD undefined for 0 and 0");
            return;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}
// Enter 3 numbers from the user and print their average
package Exercise;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number (a): ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number (b): ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number (c): ");
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;
        System.out.println("The average of " + a + ", " + b + " and " + c + " is: " + avg);

    }
}

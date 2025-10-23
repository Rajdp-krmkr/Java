package Exercise;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to compare by pressing enter: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
            return;
        } else if (num1 == num2) {
            System.out.println("Both numbers are equal.");
            return;
        } else
            System.out.println(num2 + " is greater than " + num1);

    }
}

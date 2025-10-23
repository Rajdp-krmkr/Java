package Exercise;

import java.util.Scanner;

public class power {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter base and exponent: ");
    int base = s.nextInt();
    int exponent = s.nextInt();
    int result = (int) Math.pow(base, exponent);
    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
  }   
}

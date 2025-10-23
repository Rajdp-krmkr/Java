package Exercise;

import java.util.Scanner;

public class EndlessInputs {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        int[] Integers = new int[1000];
        int count = 0;
        while (!input.equals("exit")) {
            input = sc.nextLine();
            try {
                int integer = Integer.parseInt(input);
                Integers[count] = integer;
                count++;
            } catch (NumberFormatException e) {
                if (!input.equals("exit")) {
                    System.out.println("Invalid input, please enter a number or 'exit'");
                }
                System.out.println("You have entered " + count + " valid integers.");
                System.out.print("The integers are: ");
                for (int i = 0; i < count; i++) {
                    System.out.print(Integers[i] + " ");
                }
                System.out.println();
                break;
            }
        }

    }

}

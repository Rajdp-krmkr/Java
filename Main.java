import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // String input = sc.next();  // takes only one word as token 
        String input = sc.nextLine(); //for multiple words (takes multiple words as token)
        System.out.println("Hello, " + input + "!");
    }
}
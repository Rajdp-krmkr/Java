package StringsExercise;
/* 
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/

import java.util.Scanner;

public class EmailToUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.next();
        String username = "";

        if (email.contains("@")) {

            int index = email.indexOf('@');
            username = email.substring(0, index);
            
            // System.out.println(index);
            System.out.println("Your username is: " + username);

        } else {
            System.out.println("Invalid email format. '@' symbol not found.");
        }
    }
}

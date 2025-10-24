package StringsExercise;

// input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example:
// original=“eabcdef’; result=“iabcdif”
// Original=“xyz”; result=“xyz”


import java.util.Scanner;

public class replaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String originalString = sc.next();
        String result = "";

        for (int i = 0; i < originalString.length(); i++) {
            char currentChar = originalString.charAt(i);
            if (currentChar == 'e') {
                result += 'i';
            } else {
                result += currentChar;
            }    
        }
        System.out.println("The new string after replacing 'e' with 'i' is: " + result);
    }
}

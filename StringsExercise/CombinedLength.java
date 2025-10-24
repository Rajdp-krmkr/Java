package StringsExercise;

/* 
 Take an array of Strings input from the user & 
find the cumulative (combined) length of all those strings.
*/

import java.util.Scanner;

public class CombinedLength {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of string array: ");
            int arrayLength = sc.nextInt();
            
            String stringArray[] = new String[arrayLength];
            
            //input of strings:
            int a = 0;
            while(a < arrayLength) {
                System.out.println("Enter string " + (a + 1) + ": ");
                String inputString = sc.next();
                stringArray[a] = inputString;
                a++;
            }
            // calculating combined length:
            int combinedLength = 0;

            for (int i = 0; i < stringArray.length; i++) {
                combinedLength += stringArray[i].length();
            }
            System.out.println("The combined length of all the strings is: " + combinedLength);
        }
}

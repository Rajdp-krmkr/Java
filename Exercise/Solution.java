package Exercise;

import java.util.Scanner;

public class Solution {
    public static boolean hasSameDigits(String s) {
        String newString = "";
        System.out.println(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            int b = s.charAt(++i);
            System.out.println(a + " " + b);
            int sum = (Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b))) % 10;
            newString += String.valueOf(sum);
            System.out.println(newString);

        }
        System.out.println(newString);

        if (newString.charAt(newString.length() - 1) == newString.charAt(newString.length() - 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String numString = scn.next();
        Boolean result = hasSameDigits(numString);
        System.out.println(result);
    }

}
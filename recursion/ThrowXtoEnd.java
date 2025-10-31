package recursion;

public class ThrowXtoEnd {
    public static String newStirng = "";
    public static String XString = "";

    public static void ThrowXtoEnd(String str, int index) {

        if (index == str.length()) {
            newStirng += XString;
            return;
        }

        char newChar = str.charAt(index);
        System.out.println(newChar);

        if (newChar != 'x' && newChar != 'X') {
            newStirng += newChar;
        } else {
            XString += "x";
        }

        ThrowXtoEnd(str, index + 1);
    }

    public static void main(String[] args) {

        ThrowXtoEnd("axbcxxdXefxgXh", 0);
        // System.out.println(XString.length());

        for (int i = 0; i < newStirng.length(); i++) {
            System.out.print(newStirng.charAt(i));
        }
    }
}

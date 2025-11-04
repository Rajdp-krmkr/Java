package pca2.set1;

public class Wrapper {
    public static void main(String[] args) {

        int i = 25;
        Integer intObj = Integer.valueOf(i);
        int iVal = intObj.intValue();

        float f = 12.5f;
        Float floatObj = Float.valueOf(f);
        float fVal = floatObj.floatValue();

        double d = 99.99;
        Double doubleObj = Double.valueOf(d);
        double dVal = doubleObj.doubleValue();

        char c = 'A';
        Character charObj = Character.valueOf(c);
        char cVal = charObj.charValue();

        Integer num = 10;

        int val = num;

        System.out.println("Integer: " + i + " -> Boxed: " + intObj + " -> Unboxed: " + iVal);
        System.out.println("Float: " + f + " -> Boxed: " + floatObj + " -> Unboxed: " + fVal);
        System.out.println("Double: " + d + " -> Boxed: " + doubleObj + " -> Unboxed: " + dVal);
        System.out.println("Character: " + c + " -> Boxed: " + charObj + " -> Unboxed: " + cVal);

        System.out.println("Auto-boxing:" + num);
        System.out.println("Auto-unboxing:" + val);

    }
}
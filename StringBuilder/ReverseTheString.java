package StringBuilder;

public class ReverseTheString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, World");
        sb.reverse();
        System.out.println(sb);
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
        
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
        // int result = factorial(5);
        // System.out.println(result);
    }

    // public static int factorial(int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     return factorial(n - 1) * n; 
    // }
}

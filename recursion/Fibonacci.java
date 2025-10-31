package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int result = CalcFibonacci(6);
        System.out.println(result);
    }

    public static int CalcFibonacci(int n) {
        int a = 0, b = 1;

        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }

        if (n == 3) {
            return a + b;
        }

        int sum = a + b + CalcFibonacci(n - 1);

        return sum;
    }
}
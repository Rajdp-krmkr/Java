package recursion;
// here the stack size is Log(n)

public class CalculatePowern {
    public static void main(String[] args) {
        double result = CalculatePower(3.9, 6);
        System.out.println(result);
    }

    public static double CalculatePower(double x, int n) {
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            return Math.pow(CalculatePower(x, n / 2), 2);
        } else {
            return Math.pow(CalculatePower(x, (n - 1) / 2), 2) * x;
        }
    }
}

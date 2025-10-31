package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TowerOfHanoi(3, "Source", "Helper", "Destination");
        
    }
    public static void TowerOfHanoi(int n, String src, String Helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(n - 1, src, dest, Helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        TowerOfHanoi(n - 1, Helper, src, dest);
        
    }
}

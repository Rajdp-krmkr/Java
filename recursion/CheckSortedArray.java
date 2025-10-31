package recursion;

public class CheckSortedArray {
    public static boolean isSorted(int arr[], int index) {

        if (arr.length == 0 || arr.length == 1) {
            return true;
        }

        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] < arr[index + 1] || arr[index] == arr[index + 1]) {
            return isSorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 4, 5 };
        boolean result = isSorted(arr, 0);
        System.out.println(result);
    }
}

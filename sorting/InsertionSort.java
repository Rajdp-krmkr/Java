package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 34, 25, 12, 64, 22, 11, 90 };
        int sortedArr[] = insertionSort(arr);

        System.out.print("Sorted array: [");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(" " + sortedArr[i] + " ");
        }
        System.out.print("]");

    }

    public static int[] insertionSort(int arr[]) {
        int sortedArr[] = new int[arr.length];
        sortedArr[0] = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            int compareElement = i;
            // System.out.println("Comparing Element: " + arr[compareElement]);

            for (int j = i - 1; j >= 0; j--) {
                if (sortedArr[j] > arr[compareElement]) {
                    sortedArr[j + 1] = sortedArr[j];
                    sortedArr[j] = arr[compareElement];
                } else {
                    sortedArr[j + 1] = arr[compareElement];
                    // System.out.println("Shifting Element: " + sortedArr[j]);
                    break;
                }
            }
            // System.out.println("sorted arr: ");
            // for (int k = 0; k < sortedArr.length; k++) {
            //     System.out.print(sortedArr[k] + " ");
            // }
            // System.out.println();
        }

        return sortedArr;
    }
}

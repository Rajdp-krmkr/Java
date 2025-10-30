package sorting;

public class SelectionSort {
    
        public static void main(String[] args) {
            int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
            selectionSort(arr);
            System.out.print("[");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(" "+arr[i] + " ");
            }
            System.out.print("]");
        }

        public static void selectionSort(int arr[]) {
            int n = arr.length;

            for(int i = 0; i < n - 1; i++) {
                // int smallest = arr[i];
                int smallest = i;
                // int minIndex = i;
                for(int j = i; j < n - 1; j++) {
                    if(arr[smallest] > arr[j + 1]) {
                        // smallest = arr[j+1];
                        smallest  = j + 1;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
}

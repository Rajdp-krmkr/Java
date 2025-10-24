package Exercise;

import java.util.Scanner;

public class search {
    public static int linearSearch(int arr[], int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index: " + i);
                return i;
            }
        }
        System.out.println("Element not found in the array.");
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array by pressing enter:");
        int inputArray[] = new int[size];

        //input from the user
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        //searching element
        System.out.println("Enter the element to be searched:");
        int searchElement = scanner.nextInt();
        int resultIndex = linearSearch(inputArray, size, searchElement);

        if (resultIndex != -1) {
            System.out.print("The element "+ searchElement + " is present at index " + resultIndex + " in the array [");
            for (int i = 0; i < size; i++) {
                System.out.print(inputArray[i]);
                if (i < size - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("Search completed. Element not found."); 
        }
    }
}


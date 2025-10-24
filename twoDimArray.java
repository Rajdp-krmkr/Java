import java.util.Scanner;

public class twoDimArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter cols: ");
        int cols = scanner.nextInt();

        int numbers[][] = new int[rows][cols];

        System.out.println(
                "Now, enter the values of the 2D array\n(Enter columns by spacing and enter rows by pressing enter):");
        
        // input:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        // output of the array:
        System.out.println("Your 2D array is:");
        for (int i = 0; i < rows; i++) {
            System.out.print("[");
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + numbers[i][j] + " ");
            }
            System.out.print("]\n");
        }

        // take input of the searching element:
        System.out.println("Now, enter the value of the element: ");
        int searchedElement = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == searchedElement) {
                    System.out.println("Element " + searchedElement + " found at: (" + i + ", " + j + ")");
                    break;
                }
            }
        }



    }
}

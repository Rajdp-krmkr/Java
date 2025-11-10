package pca2.set2;

import java.util.ArrayList;
import java.util.Iterator;

// Program to create an ArrayList and use Iterator to traverse and remove odd elements

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("=== Adding Elements to ArrayList ===");
        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }

        System.out.println("Original ArrayList: " + list);
        System.out.println("Size: " + list.size());

        System.out.println("\n=== Traversing with Iterator ===");
        System.out.println("Removing odd elements...");

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print("Checking element: " + element);

            // Check if element is odd
            if (element % 2 != 0) {
                iterator.remove(); // Remove odd element using iterator
                System.out.println(" -> ODD (Removed)");
            } else {
                System.out.println(" -> EVEN (Kept)");
            }
        }

        System.out.println("\n=== After Removing Odd Elements ===");
        System.out.println("Modified ArrayList: " + list);
        System.out.println("Size: " + list.size());

        System.out.println("\n=== Example 2: Custom Numbers ===");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(25);
        list2.add(30);
        list2.add(47);
        list2.add(50);
        list2.add(63);
        list2.add(80);
        list2.add(91);

        System.out.println("Original: " + list2);

        Iterator<Integer> iter2 = list2.iterator();
        while (iter2.hasNext()) {
            if (iter2.next() % 2 != 0) {
                iter2.remove();
            }
        }

        System.out.println("After removing odd elements: " + list2);

        System.out.println("\n=== Why Use Iterator.remove()? ===");
        System.out.println("✓ Iterator.remove() is safe during iteration");
        System.out.println("✓ Using list.remove() during iteration causes ConcurrentModificationException");
        System.out.println("✓ Iterator keeps track of modifications properly");
    }
}

package ArrayData;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchLinear {

    // Method for linear search
    public static int linearSearch(ArrayList<Integer> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                return i; // return index
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();

            ArrayList<Integer> numbers = new ArrayList<>();
            System.out.println("Enter " + size + " elements: ");
            for (int i = 0; i < size; i++) {
                numbers.add(sc.nextInt());
            }

            System.out.print("Enter the element to search: ");
            int searchElement = sc.nextInt();

            int index = linearSearch(numbers, searchElement);

            if (index != -1) {
                System.out.println("Element " + searchElement + " found at position " + (index + 1));
            } else {
                System.out.println("Element " + searchElement + " not found.");
            }
        }
    }
}

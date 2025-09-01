package ArrayData;
import java.util.Scanner;
import java.util.ArrayList;

public class Largest_ele {

    static void inputNum(ArrayList<Integer> arr, Scanner sc, int size) {
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            arr.add(value);
        }
    }

    static void largestElement(ArrayList<Integer> arr) {
        int largest = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > largest) {
                largest = arr.get(i);
            }
        }
        System.out.println("Largest element is " + largest);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        inputNum(arr, sc, size);
        largestElement(arr);

        sc.close();
    }
}

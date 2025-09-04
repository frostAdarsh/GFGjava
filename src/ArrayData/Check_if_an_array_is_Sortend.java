package ArrayData;

import java.util.Scanner;

public class Check_if_an_array_is_Sortend {

    static boolean inSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];


        System.out.println("Enter the value");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        if (inSorted(arr)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}

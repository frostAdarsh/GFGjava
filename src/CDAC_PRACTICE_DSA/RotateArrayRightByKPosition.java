package CDAC_PRACTICE_DSA;

import java.util.Scanner;

public class RotateArrayRightByKPosition {

    // reverse function
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // rotate right by k
    private static void rotateRight(int[] arr, int n, int k) {
        k = k % n;


        reverse(arr, 0, n - 1);


        reverse(arr, 0, k - 1);


        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the values");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value to Rotate");
        int rotate = sc.nextInt();

        rotateRight(arr, size, rotate);

        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

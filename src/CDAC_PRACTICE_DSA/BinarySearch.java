package CDAC_PRACTICE_DSA;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int size, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public  static int firstOccurrence(int[] arr, int size, int target){
       int start =0;
       int end = arr.length-1;
       int result = -1;
       while (start<=end){
           int mid = start + (end - start) / 2;
           if (arr[mid] == target) {
               result = mid;
               end = mid - 1;
           }
           else if (arr[mid] > target) {
               end = mid - 1;
           }
           else {
               start = mid + 1;
           }

       }
        return result;
    }

    public  static int lastOccurrence(int[] arr, int size, int target){
        int start =0;
        int end = arr.length-1;
        int result = -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return result;
    }

    public  static  int totalOccurrence(int[] arr,int size,int target){
        int first = firstOccurrence(arr,size,target);
        if(first == -1){
            return 0;
        }

        int last = lastOccurrence(arr,size,target);
        if(last == -1){
            return 0;
        }
        return last - first +1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter sorted values in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();

//        int result = binarySearch(arr, size, target);
//        int result = firstOccurrence(arr,size,target);
//        int result = lastOccurrence(arr,size,target);
        int result = totalOccurrence(arr,size,target);
        System.out.println(result);


    }
}

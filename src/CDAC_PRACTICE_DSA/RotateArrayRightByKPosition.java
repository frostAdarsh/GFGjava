package CDAC_PRACTICE_DSA;

import java.util.Scanner;

public class RotateArrayRightByKPosition {
    private static void rotateArrayByK(int[] arr, int size) {
          int first =0;
          int last = size-1;
          while (first<last){
              int temp;
              temp= arr[first];
              arr[first]=arr[last];
              arr[last]=temp;
              first++;
              last--;
          }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the value");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to Rotate");
        int rotate = sc.nextInt();

        rotateArrayByK(arr,size);
        rotateArrayByK(arr,size-rotate);
        rotateArrayByK(arr,size);


        System.out.println("Rotate the array");
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}

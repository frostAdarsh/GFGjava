package YoutubeDSAPractice.searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingMain {
   public  static  int linearSearch(int [] arr,int key){
      for (int i=0;i<arr.length;i++){
          if(arr[i]==key){
              return i;
          }
      }
      return  -1;

   }

   public  static  int binarySearch(int[] arr,int key){
       int left = 0,right = arr.length-1,mid;
       while (left<=right){
           mid= left +  (right-left)/2;
           if(key == arr[mid]){
               return mid;
           }
           else if(key<arr[mid]){
               right =mid-1;
           }
           else
               left= mid+1;
       }
       return -1;
   }


    public static int recBinarySearch(int[] arr, int left, int right, int key) {

        if (left > right) {
            return -1;
        }


        int mid = left + (right - left) / 2;


        if (arr[mid] == key) {
            return mid;
        }


        if (key < arr[mid]) {
            return recBinarySearch(arr, left, mid - 1, key);
        }


        return recBinarySearch(arr, mid + 1, right, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {88,33,66,44,77,22,55,11};
//        System.out.println("Enter the key to search");
//        int key = sc.nextInt();
//        int index = linearSearch(arr,key);
//        if(index!=-1){
//            System.out.println("Key found at index: "+ index);
//        }
//        else
//            System.out.println("Key not found");
//        Arrays.sort(arr);
//        System.out.println("Enter the key to search");
//        int key = sc.nextInt();
//        int index = binarySearch(arr,key);
//        if(index!=-1){
//            System.out.println("Key found at index: "+ index);
//        }
//        else
//            System.out.println("Key not found");

        Arrays.sort(arr);
        System.out.println("Enter the key to search");
        int key = sc.nextInt();
        int index = recBinarySearch(arr,0,arr.length-1,key);
        if(index!=-1){
            System.out.println("Key found at index: "+ index);
        }
        else
            System.out.println("Key not found");

    }
}

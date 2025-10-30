package YoutubeDSAPractice.sorting;

import java.util.Arrays;

public class SortingMain {

    public  static  void selectionSort(int []arr){
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
//           System.out.println(Arrays.toString(arr)); for testing
       }
    }

    public  static  void bubbleSort(int []arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public  static  void impBubbleSort(int []arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapflag = false;
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapflag=true;
                }
            }
            if(!swapflag){
                break;
            }
        }
    }

    public  static  void insertionSort(int []arr){
        for(int i=1;i< arr.length;i++){
            int j,temp = arr[i];
            for(j=i-1;j>=0 && arr[j]>temp;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] =temp;
        }
    }


    public static void main(String[] args) {

//        int[] arr = {6,4,2,8,3,1};
//        System.out.println("Selection Sort");
//        System.out.println("Before "+ Arrays.toString(arr));
//        selectionSort(arr);
//        System.out.println("After "+Arrays.toString(arr));


//        int[] arr = {6,4,2,8,3,1};
//        System.out.println("Bubble Sort");
//        System.out.println("Before "+ Arrays.toString(arr));
////        bubbleSort(arr);
//        impBubbleSort(arr);
//        System.out.println("After "+Arrays.toString(arr));

        int[] arr = {6,4,2,8,3,1};
        System.out.println("insertion Sort");
        System.out.println("Before "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After "+Arrays.toString(arr));



    }


}

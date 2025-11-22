package CDAC_PRACTICE_DSA;

public class BubbleSort {
   public  static  void bubbleSort(int arr[]){
       int n= arr.length-1;
      for(int i=0;i<n;i++){
          boolean flag = false;
          for (int j=0;j<n-i;j++){
              if(arr[j]>arr[j+1]){
                  int temp;
                  temp = arr[j];
                  arr[j]= arr[j+1];
                  arr[j+1] = temp;
                  flag = true;
              }
          }
          if(!flag){
              break;
          }
      }


   }


    public static void main(String[] args) {

        int[] arr ={7,3,5,38,8,32};

        bubbleSort(arr);

        for (int num:arr){
            System.out.print(num + " ");
        }

    }
}

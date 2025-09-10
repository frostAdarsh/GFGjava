package myPractice;

public class LeftRotateAnArrayByOne {

    static void lRotate(int arr[],int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int x: arr){
            System.out.println(x+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50};
        lRotate(arr,5);

    }
}

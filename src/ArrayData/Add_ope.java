package ArrayData;
import java.util.ArrayList;
import java.util.Scanner;
public class Add_ope {

//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println("Enter the size of array");
//        int size = sc.nextInt();
//
//        for(int i =0;i<size;i++){
//           int value = sc.nextInt();
//           arr.add(value);
//        }
//        for(int i=0;i<size;i++){
//            System.out.println(arr.get(i));
//        }
//
//        sc.close();
//    }
    // ---------------with function----------------

    static void inputElement(ArrayList<Integer> arr,Scanner sc,int size){
        for (int i=0;i<size;i++){
            int value = sc.nextInt();
            arr.add(value);
        }
    }

    static void displayElements(ArrayList<Integer> arr){
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }

    // Function to insert element at specific position
    static void insertAt(ArrayList<Integer> arr, int index, int value) {
        if (index >= 0 && index <= arr.size()) {
            arr.add(index, value);
            System.out.println("Element inserted at index " + index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        inputElement(arr,sc,size);
        displayElements(arr);


        // Example: Insert at specific position
        System.out.print("Enter element to insert: ");
        int newVal = sc.nextInt();
        System.out.print("Enter index to insert at (0-based): ");
        int index = sc.nextInt();

        insertAt(arr, index, newVal);   // calling function
        displayElements(arr);
    }
}

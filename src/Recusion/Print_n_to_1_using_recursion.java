package Recusion;
import  java.util.Scanner;

public class Print_n_to_1_using_recursion {

   static void printNto1(int n){
        if(n==0){
            return;
        }
       System.out.println(n);

        printNto1(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();

       printNto1(x);

    }
}

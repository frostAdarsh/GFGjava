package Recusion;
import  java.util.Scanner;
public class Factorial_num {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return  n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

        System.out.println(fact(n));
    }
}

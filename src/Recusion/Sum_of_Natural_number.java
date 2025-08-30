package Recusion;
import java.util.Scanner;
public class Sum_of_Natural_number {

    static int sumN(int n){
        if(n==0){
            return 0;
        }
        return  n + sumN(n-1);

    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        System.out.println(sumN(5));

    }
}

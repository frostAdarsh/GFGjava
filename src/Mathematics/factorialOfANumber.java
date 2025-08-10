package Mathematics;
import java.util.Scanner;
public class factorialOfANumber {
    static int factorial(int x){
        if(x==0){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }
   // better than above because take less space in memory
    static int factTwo(int x){
        int res= 1;
        for(int i=2;i<=x;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println(factorial(x));
        System.out.println(factTwo(x));
    }
}

package Mathematics;
import java.util.Scanner;

public class trailingZeroInFactorial {

    static int countZero(int x){
        int fact = 1;
        for(int i=2;i<=x;i++){
            fact = fact*i;
        }
        int res=0;

        while (fact%10==0){
            res++;
            fact=fact/10;
        }
        return res;
    }

    // better approach solve issue of overflow----------
    static int countZeroTwo(int x){
        int res=0;
        for(int i=5;i<=x;i=i*5){
            res=res+x/i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");

        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();

        System.out.println(countZero(x));
        System.out.println(countZeroTwo(x));
    }
}

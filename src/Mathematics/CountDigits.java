package Mathematics;
import  java.util.Scanner;

public class CountDigits {

    static int countnum(int v){

        int res = 0;
        while(v>0){
            v=v/10;
            res++;
        }
        return  res;

    }

    public static void main(String[] args) {
        System.out.println("enter the digit");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        System.out.println(countnum(v));


        sc.close();


    }
}

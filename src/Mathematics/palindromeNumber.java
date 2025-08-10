package Mathematics;

import  java.util.Scanner;

public class palindromeNumber {

    static boolean isPal(int x){
     int rev=0;
     int temp = x;
     while (temp!=0){
         int ld = temp%10;
         rev = rev*10+ld;
         temp =temp/10;
     }
     return (rev==x);
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();

        System.out.println(isPal(x));

        sc.close();

    }
}

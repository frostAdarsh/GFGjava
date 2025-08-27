package Recusion;
import java.util.Scanner;

public class RecursionOne {
    static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun1(n-1);
        System.out.println(n);    }

    static void fun2(int n){
       if(n==0){
           return;
       }
       fun2(n-1);
        System.out.println(n);
        fun2(n-1);
    }

    static int fun3(int n){
        if(n==1){
           return 0;
        }
        else{
            return 1+ fun3(n/2);
        }
    }

    static void fun4(int n) {
        if (n == 0) {
            return;
        }
        fun4(n / 2);
        System.out.println(n % 2);
    }

    public static void main(String[] args) {
//        fun1(3);
//        fun2(3);
//        System.out.println(fun3(16));
        fun4(7);
    }
}

package Recusion;
import java.util.Scanner;

public class Fibonacci_Number {
    static int fib(int n) {
        if (n == 0) {
            return 0;  // base case
        }
        if (n == 1) {
            return 1;  // base case
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Fibonacci of " + n + " = " + fib(n));
    }
}

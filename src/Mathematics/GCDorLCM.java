package Mathematics;
import java.util.Scanner;

public class GCDorLCM {

    // Recursive method to find GCD using Euclidean algorithm
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to find LCM using GCD
    static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two positive integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("⚠ Please enter only positive numbers.");
        } else {
            int gcdValue = gcd(a, b);
            int lcmValue = lcm(a, b);

            System.out.println("✅ Results:");
            System.out.println("GCD of " + a + " and " + b + " = " + gcdValue);
            System.out.println("LCM of " + a + " and " + b + " = " + lcmValue);
        }

        sc.close();
    }
}

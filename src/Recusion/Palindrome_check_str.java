package Recusion;
import java.util.Scanner;
public class Palindrome_check_str {

    boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end)) && isPalindrome(str,start+1,end-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Palindrome_check_str obj = new Palindrome_check_str();

        if (obj.isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }

    }
}

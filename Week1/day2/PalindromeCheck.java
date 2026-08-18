package Week1.day2;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int reverse = 0;
        int original = n;
        while(n!=0){
            int digit = n % 10;
            reverse = reverse*10+digit;
            n = n/10;
            
        }
        if (original == reverse){
            System.out.println("The number is a palindrome");
        }
        else {
             System.out.println("The number is not a palindrome");
        }



    }
    
}

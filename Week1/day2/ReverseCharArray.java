package Week1.day2;
import java.util.*;

public class ReverseCharArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("Reversed array is: ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
    
}

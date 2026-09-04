package Week1.day3;
import java.util.*;
class prefixsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter the array elements:");
        for(int i =0;i <n;i++){
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum = sum+nums[i];
            nums[i] = sum;
        }
        System.out.println("THE PREFIX SUM IS");
         for(int i = 0; i<n;i++){
            System.out.println(nums[i]+" ");
        }


    }
}

    

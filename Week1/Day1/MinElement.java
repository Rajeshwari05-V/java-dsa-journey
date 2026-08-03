package Week1.Day1;
import java.util.Scanner;
public class MinElement {
  
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enter 6 elements:");
        for(int i=0;i<6;i++)
        {
            arr[i] = sc.nextInt();
        }

        int min_ele = arr[0];

        for(int i =1;i<6;i++){
            if(arr[i] < min_ele){
                min_ele = arr[i];
            }

        } 
            System.out.println("THE MAXIMUM ELEMENT IS :"+min_ele);
        }
        
    }



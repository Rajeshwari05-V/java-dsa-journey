package Week1.Day1;

import java.util.Arrays;
public class ReverseArray {
    public static void main(String args[])
    {
        int arr[] = {122,788,80877,377378,983873};
        int rev[] = new int[arr.length];
        int j=0;
        for (int i = arr.length-1;i>=0;i--){
            rev[j] = arr[i];
            j++;

        }
        System.out.println("The reverse of array is :" + Arrays.toString(rev));
    }

    
}

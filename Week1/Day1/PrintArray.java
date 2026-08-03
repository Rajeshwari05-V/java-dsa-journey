package Week1.Day1;
import java.util.Arrays;
public class PrintArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[1] = 123;
        arr[2] = 578;
        arr[3] = 687;
        arr[4] = 578;
        arr[0] = 896;
        System.out.println("the array is :" + Arrays.toString(arr));//  mistake was i dint add plus 
    }
    
}

package Week1.Day1;

public class SumAverage {
    public static void main(String args[])
    {
        int arr[] = {424625,26764324,7265653,92876,98276};
        int sum = 0,avg = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            avg = sum/arr.length;

        }
        System.out.println("THE SUM IS:" + sum);
        System.out.println("THE AVG IS:" + avg);
        

    }
    
}

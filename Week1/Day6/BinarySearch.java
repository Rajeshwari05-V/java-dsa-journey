package Week1.Day6;

public class BinarySearch {
    public static int binarySearch(int[] nums,int target){
        int low = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return  mid;
            else if(nums[mid] < target){
                 low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
        }
    public static void main (String args[]){

          int[] nums = {45,78,89,98,105,250};
          int target = 105;
          int result = binarySearch(nums,target);
         System.out.println("Target index: " + result);
    }
       
        }
        


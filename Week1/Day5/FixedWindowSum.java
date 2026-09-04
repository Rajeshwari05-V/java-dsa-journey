package Week1.Day5;

public class FixedWindowSum {
    public static int maxSum(int[] nums,int k){
        int windowsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0 ; i < k ; i++){
            windowsum += nums[i];
        }
        maxsum = windowsum;

        for(int i = k ; i < nums.length ; i++ ){
            windowsum += nums[i];
            windowsum -= nums[i-k];
            maxsum = Math.max(maxsum ,windowsum);
        }

         return maxsum;


        }
        public static void main(String [] args){

            int[] nums = {2,1,5,1,3,2};
            int k = 3;

            System.out.println(maxSum(nums, k));
        }


    }
    

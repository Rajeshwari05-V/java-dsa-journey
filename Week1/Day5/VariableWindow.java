package Week1.Day5;

public class VariableWindow {
    public static int minSubArrayLen(int target, int[] nums){
        int left = 0 ;
        int windowsum = 0;
        int minsum = Integer.MAX_VALUE;
        for(int right = 0 ; right < nums.length ; right++){
            windowsum += nums[right];

            while (windowsum >= target){
                int currentLength = right - left + 1;
                minsum = Math.min(minsum,currentLength);

                windowsum -= nums[left];
                left++;
            }
        }
        return minsum == Integer.MAX_VALUE ? 0 : minsum;

    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
    
}

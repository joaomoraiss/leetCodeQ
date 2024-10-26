import java.util.ArrayList;
import java.util.List;

public class MaximumSubArray53 {
    public static void main(String[] args) {
        int nums[] = new int[]{-2,1,-3,4,-1,2,1,-5,4,3,5,8};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) maxSum = currentSum;
            if (currentSum < 0) currentSum = 0;
        }
        return maxSum;
    }
    public static int maxSubArray2(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum+ nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

package greedy;

public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0], curSum = 0;
        for (int num : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += num;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }
    public static void main(String[] args) {
        int[]nums={2,-3,4,-2,2,1,-1,4};
        System.out.println(maxSubArray(nums));
    }
}

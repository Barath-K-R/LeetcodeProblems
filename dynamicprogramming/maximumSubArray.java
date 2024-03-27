package dynamicprogramming;

public class maximumSubArray {
    public static int maxSubArray(int[] nums) {
        int currsum = 0, res = -1;
        for (int j = 0; j < nums.length; ++j) {

            if (nums[j] + currsum < res) {

                currsum = 0;
                continue;
            }
            currsum = currsum + nums[j];
            res = Math.max(currsum, res);
            System.out.println(nums[j] + "------" + "res=" + res + " currsum=" + currsum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -3, -2, -2, -3 };
        System.out.println(maxSubArray(nums));
    }
}


import java.util.Arrays;

public class MaximumDifferenceBetweenHighestAndLowestScoresOfK {
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = k - 1, min = Integer.MAX_VALUE;
        while (r < nums.length) {
            min = Math.min(min, nums[r] - nums[l]);
            l++;
            r++;
        }

        return min;
    }

    public static void main(String[] args) {
        int[] nums = { 90 };
        int k = 1;
        System.out.println(minimumDifference(nums, k));
    }
}
